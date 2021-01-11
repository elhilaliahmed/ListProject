public class Person {
    private String name;
    private String phoneNumber;
    private String address;
    private int age;

    Person (String name, String phoneNumber, String address, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    Person(){}

    public String getName() {
        return name;
    }

    public void remove() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Name = " + name  +
                "\nPhoneNumber = " + phoneNumber+
                "\nAddress = " + address+
                "\nAge = " + age + "\n\n\n";
    }
}
