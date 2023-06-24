import java.util.Random;

class App2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberArray = new int[100000];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(10000);
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(numberArray);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());
    }

    public static void selectionSort(int[] items) {
        for (int i = 0; i < items.length; i++) {
            int current = items[i];
            int indexCurrent = i;

            for (int j = i + 1; j < items.length; j++) {
                if (current > items[j]) {
                    current = items[j];
                    indexCurrent = j;
                }
            }

            if (indexCurrent != i) {
                items[indexCurrent] = items[i];
                items[i] = current;
            }
        }
    }
}

class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}