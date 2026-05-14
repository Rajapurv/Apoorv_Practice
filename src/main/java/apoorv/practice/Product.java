package apoorv.practice;

public class Product {
    private String productName,productCode;
    private float price;
    public void product(String productCode, String productName, float price){
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }
    public String  getProductName(){
        return productName;
    }
    public String getProductCode(){
        return productCode;
    }
    public float getPrice(){
        return price;
    }
    public float applyDiscount(float percent){
        return price - (price * percent / 100);
    }
}
