package apoorv.practice;

public class Desktop {
    private String brand,processor;
    private int ramSize;
    public void desktop(String brand, String processor, int ramSize){
        this.brand = brand;
        this.processor = processor;
        this.ramSize = ramSize;
    }
    public String getBrand(){
        return brand;
    }
    public String getProcessor(){
        return processor;
    }
    public int getRamSize(){
        return ramSize;
    }
    public int upgradeRam(int size){
        return size*ramSize;
    }
}
