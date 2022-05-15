package com.jelly.CaneBuilder.utils;

public class Clock {
    private long endTime;
    private boolean scheduled;

    public void schedule(long milliseconds) {
        this.endTime = System.currentTimeMillis() + milliseconds;
        scheduled = true;
    }

    public boolean passed() {
        return System.currentTimeMillis() >= endTime;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public void reset() {
        scheduled = false;
    }
}
