package apoorv.practice;

public class Smartphone {
    private String brand,model;
    private int storage_capacity;
    public void smartPhone(String brand,String model,int storage_capacity){
        this.brand = brand;
        this.model = model;
        this.storage_capacity = storage_capacity;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getStorage_capacity(){
        return storage_capacity;
    }
    public int increaseStorage(int val){
        return val*storage_capacity;
    }
}
