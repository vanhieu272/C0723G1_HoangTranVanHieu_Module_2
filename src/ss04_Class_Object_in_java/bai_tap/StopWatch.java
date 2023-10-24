package ss04_Class_Object_in_java.bai_tap;


public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = System.currentTimeMillis();

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        //Create array 100000 elements
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 100000);
        }
        //start time
        stopWatch.start();
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        stopWatch.stop();
        //end time
        long runTime = stopWatch.getElapsedTime();
        System.out.println("Runtime of Selection sort algorithm:  " + runTime + " milliseconds");
    }
}