package Employee;

public class Student {
    String name;
    int id;
    String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        Student student = new Student("Jyothi", 123, "Computer Science");
        student.display();
    }
}
