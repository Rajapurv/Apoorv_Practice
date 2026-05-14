package apoorv.practice;

public class Student {
    private int student_id,grades;
    private String student_name;
    public Student(String student_name,int student_id){
        this.student_id = student_id;
        this.student_name = student_name;
    }
    public void addGrade(int grades){
        this.grades = this.grades + grades;
    }
    public Student(){};
    public Student(int student_id, int grades){
        this.student_id = student_id;
        this.grades = grades;
    }
    public void printData(){
        System.out.println(this.student_id +" "+ this.student_name);
    }

}
