class App {
    public static void main(String[] args) {
        Person p1 = new Person("hamza masoud", "gaza elsabra", "0594716621", "example@gmail.com");
        System.out.println(p1);
        Student std = new Student();
        std.setName("Student 1");
        System.out.println(std);

        Employee emp = new Employee();
        emp.setName("Employee 1");
        emp.salary = 1200;
        System.out.println(emp);

        Staff staff = new Staff();
        staff.setName("Staff 1");
        staff.salary = 1200;
        staff.title = "title of staff";
        System.out.println(staff);

        Faculty faculty = new Faculty();
        faculty.setName("Faculty 1");
        faculty.salary = 12000;
        faculty.officeHours = 10.0;
        System.out.println(faculty);

    }
}