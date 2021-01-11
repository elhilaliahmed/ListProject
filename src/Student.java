public class Student extends Person{

    private String module;

    Student(String name, String phoneNumber, String address, int age, String module) {
        super(name, phoneNumber, address, age);
        this.module = module;
    }


    @Override
    public String toString() {
        return getName();
    }
}
