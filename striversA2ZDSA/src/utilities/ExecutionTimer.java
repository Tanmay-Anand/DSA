package utilities;

public class ExecutionTimer {

    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getDuration() {
        return endTime - startTime;
    }
}
