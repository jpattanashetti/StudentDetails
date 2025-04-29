package Employee;

public class Employee {
    
        String name;
        int id;
        double salary;
        
        public Employee(String name,int id,double salary){
            this.name=name;
            this.id=id;
            this.salary=salary;
           
        }
        public void display(){
            System.out.println("Employee name"+name);
            System.out.println("Employee id"+id);
            System.out.println("Employee salary"+salary);
            
        }
        public static void main(String[] args){
            Employee emp1=new Employee("Jyothi",101,5000.0);
            emp1.display();
        }
    }
