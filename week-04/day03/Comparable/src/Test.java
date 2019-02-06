import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Student> people = new ArrayList<>();

        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student johnClone = john.clone();
        people.add(johnClone);
        johnClone.skippedDays = 10;

        for (Student student : people) {
            student.introduce();
        }
    }
}
