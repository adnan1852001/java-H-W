import java.util.ArrayList;
import java.util.Random;

class App {
    public static void main(String[] args) {
    
        Random random = new Random();
        ArrayList<Integer> numberArray = new ArrayList<Integer>();

        for (int i = 0; i < 100000; i++)
            numberArray.add(random.nextInt(10000));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        sorting(numberArray);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    
    }

    public static void sorting(ArrayList<Integer> items) {
        for (int i = 0; i < items.size(); i++) { 
            int current = items.get(i);
            int indexCurrent = i;

            for (int j = i + 1; j < items.size(); j++) {
                if (current > items.get(j)) {
                    current = items.get(j);
                    indexCurrent = j;
                }
            }

            if (indexCurrent != i) {
                items.set(i, current);
                items.set(indexCurrent, items.get(i));
            }
        }
    }
}

class StopWatch {
    private long startTime;
    private long stopTime;
    
    StopWatch () {
        this.startTime = System.currentTimeMillis();
    }

    void start() {
        this.startTime = System.currentTimeMillis();
    }

    void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    
    long getElapsedTime() {
        return this.stopTime - this.startTime;
    }

}