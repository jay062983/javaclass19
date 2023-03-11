package constructors;

public class Thiskeyword {
    int a,b;
    int sum;
    Thiskeyword(int a, int b){
        this.a=a;
        this.b=b;

    }
    void hello(){
        System.out.println("hello batch 15");
    }
    void howAreYou(){

    }
    void greetings(){
        hello();
        howAreYou();
    }
    public  void sum(int a,int b){
        sum=a+b;
        System.out.println("sum of local variable="+a+b);
        System.out.println("sum of instance variable"+this.a+this.b);
    }
    public static void main(String[]args){
        Thiskeyword obj=new Thiskeyword(10,20);

        obj.sum(100,200);
        obj.greetings();
    }
}
