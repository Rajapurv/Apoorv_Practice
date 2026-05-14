package apoorv.practice;

public class Person {
    private String name,country;
    private int age;
    public void setPerson(String name,String country, int age){

        this.name = name;
        this.country = country;
        this.age = age;


    }
    public String getName(){
        return name;
    }
    public String getCountry(){
        return country;
    }
    public int getAge(){
        return age;
    }

}

