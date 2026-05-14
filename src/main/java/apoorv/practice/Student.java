package apoorv.practice;

public class Student {
    private int student_id,grades;
    private String student_name;
    public void Student(String student_name,int student_id){
        this.student_id = student_id;
        this.student_name = student_name;
    }
    public void addGrade(int grades){
        this.grades = this.grades + grades;
    }
}
