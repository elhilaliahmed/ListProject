public class Student extends Person{

    private String module;

    Student(String name, String phoneNumber, String address, int age, String module) {
        super(name, phoneNumber, address, age);
        this.module = module;
    }

    @Override
    public String toString() {
        return
                "Name = " + getName() +
                        "\nPhoneNumber = " + getPhoneNumber() +
                        "\nAddress = " + getAddress() +
                        "\nAge = " + getAge() +
                        "\nModule = " + module + "\n\n\n";
    }
}
