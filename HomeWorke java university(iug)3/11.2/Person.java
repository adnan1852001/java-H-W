public class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    Person() {
    }

    Person(String nm, String address, String phone, String email) {
        this.name = nm;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return getClass() + " : " + this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
