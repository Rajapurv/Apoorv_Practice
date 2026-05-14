package apoorv.practice;

import java.util.Date;

public class Car {
    private String company_name,model_name;
    private int year,mileage;
    public void setCar(String company_name,String model_name,int year,int mileage){
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }
    public int getMileage(){
        return mileage;
    }
}
