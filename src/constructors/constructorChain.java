package constructors;

public class constructorChain {

    constructorChain(){
        System.out.println("I am a non argument constructor");
    }
    constructorChain(String str){
        this();// calling non argument constructor, the one above
        //this() => Always must be on the first line
        System.out.println(str);
    }
    constructorChain(int number){
      //this(str);
        this("hello");

        System.out.println("This is constructor with int parameter");
    }

    public static void main(String[] args) {
        constructorChain obj=new constructorChain(10);
        System.out.println("----End of the code---");
    }
}
