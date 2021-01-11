public class Teacher extends Person {

    private int salary;

    Teacher(String name, String phoneNumber, String address, int age, int salary) {
        super(name, phoneNumber, address, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher " + getName() + " salary is " + salary + "\n";
    }
}
