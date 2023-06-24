import java.util.Scanner;

class App {
    static String[] months = { "January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October",
            "November", "December" };
    static int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the nimber of the munth: ");
        int i = input.nextInt();
        try {
            System.out.println("the month is " + months[--i] + " and the number of days is " + dom[--i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong number");
        }
    }
}