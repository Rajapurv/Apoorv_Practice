package apoorv.practice;

public class Employee {
private int emp_id;
private String emp_name;
private float emp_salary;
public void setEmployee(int emp_id,String emp_name,float emp_salary){
    this.emp_id = emp_id;
    this.emp_name = emp_name;
    this.emp_salary = emp_salary;
}
public int getEmp_id(){
    return emp_id;
}
public String getEmp_name(){
    return emp_name;
}
public float getEmp_salary(){
    return emp_salary;
}
}
