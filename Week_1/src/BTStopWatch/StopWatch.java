package BTStopWatch;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long result = stopTime - startTime;
        return result;
    }
}
