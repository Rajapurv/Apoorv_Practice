package apoorv.practice;

public class Main {

    public static void main(String[] args) {

            Person p = new Person(); //Person class Object
            BankAccount b = new BankAccount();//Bank Account Class Object
            Circle c = new Circle();//Circle object
            Employee e = new Employee();//Employee object
            Rectangle r = new Rectangle();//Rectangle object
            r.setRectangle(12,10);
            e.setEmployee(10451,"Apoorv",550000);
            c.setRadius(6);
            p.setPerson("Apoorv","India",29);
            b.setBankAccount(242342353532532L,3223425.453);
            System.out.println("Person Name is "+p.getName()+" He is from "+p.getCountry()+" and his age is "+p.getAge()+"\nAccount Number - "+b.getAccountNumber()
     +"\nAccount Balance - "+b.getBalance() + "\nlength - "+r.getLength()+"\nwidth - "+r.getWidth()+"\nEmpID - "+e.getEmp_id()+"\nEmpName - "+e.getEmp_name()+"\nEmpSalary - "+e.getEmp_salary()+"\nArea of Cirlce - "+c.calculateArea() + "\nPerimeter - "+c.calculatePerimeter()
            );
        }

}
