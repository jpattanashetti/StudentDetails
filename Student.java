package Employee;

public class Student {
    String name;
    int id;
    String course;
    long  phno;
    String address;

    public Student(String name, int id, String course,long  phno,String address) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phno=phno;
        this.address=address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone no: " + phno);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student = new Student("Jyothi", 123, "Computer Science", 9988977323L, "Hubli");
        student.display();
    }
}
