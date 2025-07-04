package com.lld.circuitbreaker;


/**
 * Circuit breaker pattern is one of the architectural pattern that helps to avoid repeated calls to faulty service so
 * that faulty system can recover effectively . If the caller service keeps making calls to it give no rooms for the
 * calli to recover or do a graceful restart .
 * <p>
 * When there is a fault detected , circuit breaker temporarily blocks access to the faulty service
 * <p>
 * Faults could be a transient or permanent failure. Usually transient faults could be network timeouts, service being
 * overwhelmed with traffic, temporary failure
 */
public interface CircuitBreaker {

    enum State {CLOSED, OPEN, HALF_OPEN}

    // Before request is fired , check if circuit is closed
    boolean isAllowed();

    // After a request is successfully terminated , record success
    void recordSuccess();

    // If a request fails, record failure
    void recordFailure();

}
