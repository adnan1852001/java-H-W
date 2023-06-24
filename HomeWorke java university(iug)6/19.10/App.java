import java.util.ArrayList;

class App {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add(0);
        l.add(4);
        l.add(6);
        System.out.println(min(l));
    }

    public static <T extends Comparable<T>> T min(ArrayList<T> list) {
        T smollest = list.get(0);
        for (T e : list) {
            if (e.compareTo(smollest) < 0) {
                smollest = e;
            }
        }
        return smollest;
    }
}