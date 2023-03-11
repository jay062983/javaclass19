package Inheritence;

public class Bankaccount {// parent class or super class
    long accountNumebr;
    double money;

    void deposit(){
        System.out.println("deposit methods from Bankaccount clas");

    }
}
class checking extends Bankaccount{//child class or sub class or derived class
    int interest;
    void transfer(){
        System.out.println("transfer methods from Checking class");
    }
}
class Savings extends Bankaccount{
    double profit;
    void takeprofit(){

    }
}
class SuperSavings extends Savings{
    void supersavings(){
        System.out.println("Super saving methods from superSaving Class");
    }
}