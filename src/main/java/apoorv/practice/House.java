package apoorv.practice;

public class House {
    private String address;
    private int numberOfRooms,area;
    public void house(String address,int numberOfRooms,int area){
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }
    public String getAddress(){
        return address;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public int getArea(){
        return area;
    }
    public int calculatePrice(int price){
        return price * area;
    }
}
