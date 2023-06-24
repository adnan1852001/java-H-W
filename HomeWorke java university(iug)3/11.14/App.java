import java.util.ArrayList;

class App {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1);
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(5);
        l2.add(3);
        l2.add(4);
        for (Integer integer : union(l1, l2)) {
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> resultList = list1;
        for (Integer integer : list2) {
            resultList.add(integer);
        }
        return list1;
    }
}