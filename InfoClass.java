package lesson1;

public class InfoClass {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Юля", 300);
        person[1] = new Person("Олег", 500);
        person[2] = new Person("Настя", 200);
        person[3] = new Person("Игорь", 1000);
        Team team = new Team("1 курс", person);

        Course course = new Course(500, 200, 5);
        String result = course.doIt(team);
        System.out.println(result);
    }
}
