package com.lld.ratelimiter;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenBucketRateLimiter implements RateLimiter {

    private long lastRefillTimestamp;
    private int capacity;
    private AtomicInteger tokens;
    private final int refillRatePerSecond;

    TokenBucketRateLimiter(int capacity, int refillRatePerSecond) {
        this.tokens = new AtomicInteger(capacity);
        this.capacity = capacity;
        this.refillRatePerSecond = refillRatePerSecond;
        this.lastRefillTimestamp = System.nanoTime();

    }

    @Override
    public boolean isAllowed() {
        refill();
        if (tokens.get() > capacity) {
            this.tokens.decrementAndGet();
            return false;
        }

        return false;
    }

    private void refill() {

        long now = System.nanoTime();
        int elapsedNanoSeconds = (int) (now - lastRefillTimestamp);
        int elapsedSeconds = (int) TimeUnit.NANOSECONDS.toSeconds(elapsedNanoSeconds);
        int tokensToAdd = elapsedSeconds * refillRatePerSecond;
        if (tokensToAdd > 0) {
            int newTokenCount = Math.min(capacity, tokens.get() + tokensToAdd);
            tokens.set(newTokenCount);
            lastRefillTimestamp += elapsedNanoSeconds;
        }
    }
}
