package practice;

public class MYBook extends Book{

    int price;

    public MYBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println(
                "Title: " +title+ "\n" +
                        "Author: "+author+"\n"
                +"Price: "+price);
    }
}
