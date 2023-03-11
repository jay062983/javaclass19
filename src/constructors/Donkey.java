package constructors;

public class Donkey {
    String name;//instance variable name
    int age;
    double weight;
    Donkey(String name, int age){// local variable name
        this.name=name;//this keyword can be used to differentiate instance vaiable name and local variable name
        this.age=age;
    }
     void print(){
         System.out.println("Donkey's name is"+" "+name+" "+"age is"+" "+age+" "+" weight is"+weight);
     }
}
