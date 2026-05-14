package apoorv.practice;

public class Book {
    private String title,author;
    private float price;
    public void setBook(String title,String author,float price){
        this.author = author;
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public float getPrice(){
        return price;
    }
    public void applyDiscount(float percent){
        price = (price - price * percent / 100);
    }
}
