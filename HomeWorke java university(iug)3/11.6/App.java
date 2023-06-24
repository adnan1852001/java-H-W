import java.util.ArrayList;
import java.util.Date;

class App {
    public static void main(String[] args) {
        ArrayList<Object> array = new ArrayList<>();
        array.add(new Circle());
        array.add(new Loan());
        array.add(new Date());
        array.add("test new String");
        for (Object object : array) {
            System.out.println(object.toString());
        }
    }
}

class Circle {
    String name;

    Circle() {
        name = "circle";
    }

    @Override
    public String toString() {
        return this.name;
    }
}

class Loan {
    String name;

    Loan() {
        name = "loan";
    }

    @Override
    public String toString() {
        return this.name;
    }
}
