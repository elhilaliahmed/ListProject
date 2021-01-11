import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        School school =
                new School(
                        new ArrayList<>(Arrays.asList(
                            new Teacher("Julia", "22222", "Bern", 32, 5000),
                            new Teacher("Laila", "22222", "Bern", 32, 6000),
                            new Teacher("Ahmed", "11111", "Biel", 25, 4000))),

                       new ArrayList<>(Arrays.asList(
                            new Student("Jordan", "33333", "New York", 18, "Mathematics"),
                            new Student("John", "33333", "Luzerne", 18, "Mathematics"),
                            new Student("Bill", "44444", "Basel", 10, "Geography"))));

        School s = new School(
                        new ArrayList<>(Arrays.asList(
                                new Teacher("Ahmed", "11111", "Biel", 25, 4000))),

                        new ArrayList<>(Arrays.asList(
                                new Student("Jordan", "33333", "New York", 18, "Mathematics"))));

        School bfh = new School(
                new ArrayList<>(Arrays.asList(
                        new Teacher("Ahmed", "11111", "Biel", 25, 4000))),

                new ArrayList<>(Arrays.asList(
                        new Student("Jordan", "33333", "New York", 18, "Mathematics"))));
    }
}
