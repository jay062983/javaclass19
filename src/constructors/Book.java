package constructors;

public class Book {

    String name;
    int price;
    String type;
    Book(String name,int price){
        this.name=name;
        this.price=price;
    }
    Book(String name,String type,int price){
        this(name,price);
        this.type=type;
    }
    void printbook(){
        System.out.println("Book name"+name+" "+"Book price"+" "+price+" "+"Book type"+type);
    }
}
