package com.lld.circuitbreaker;

public class SimpleCircuitBreaker implements CircuitBreaker {

    private int NUM_OF_FAILED_REQUESTS = 0;
    private int THRESHOLD = 50;
    private CircuitBreaker.State CURRENT_STATE = State.CLOSED;
    private long LAST_FAILURE_TIME = 0;
    private long TIME_OUT = 10 * 1000;

    @Override
    public boolean isAllowed() {
        if (NUM_OF_FAILED_REQUESTS < THRESHOLD)
            return true;
        if (!CURRENT_STATE.equals(State.CLOSED)) {
            if (System.currentTimeMillis() - LAST_FAILURE_TIME > TIME_OUT)
                    return true;
        }

        return false;
    }

    @Override
    public void recordSuccess() {
        switch (CURRENT_STATE) {
            case OPEN:
                // Control never comes here
                break;
            case CLOSED:
                // Send events to monitor or something
                // Calculate overall success percentile
                break;
            case HALF_OPEN:
                NUM_OF_FAILED_REQUESTS--;
                break;
        }


    }

    @Override
    public void recordFailure() {
        LAST_FAILURE_TIME = System.currentTimeMillis();
        switch (CURRENT_STATE) {
            case CLOSED:
                NUM_OF_FAILED_REQUESTS++;
                if (NUM_OF_FAILED_REQUESTS > THRESHOLD)
                    CURRENT_STATE = State.OPEN;
                break;
            case HALF_OPEN:
                NUM_OF_FAILED_REQUESTS++;
                break;
        }
    }
}
