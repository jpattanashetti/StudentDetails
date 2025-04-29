package Employee;

public class Employee {
    
        String name;
        int id;
        double salary;
        String location;
        public Employee(String name,int id,double salary,String location){
            this.name=name;
            this.id=id;
            this.salary=salary;
            this.location=location;
        }
        public void display(){
            System.out.println("Employee name"+name);
            System.out.println("Employee id"+id);
            System.out.println("Employee salary"+salary);
            System.out.println("Employee location"+location);
        }
        public static void main(String[] args){
            Employee emp1=new Employee("Jyothi",101,5000.0,"Hubli");
            emp1.display();
        }
    }
