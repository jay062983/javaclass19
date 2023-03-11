package Inheritence;

public class Test {
    public static void main(String[] args) {
        Bankaccount bankaccount=new Bankaccount();
        bankaccount.accountNumebr=342524234;
        bankaccount.money=1000;
        bankaccount.deposit();
        System.out.println(bankaccount.accountNumebr);
        System.out.println(bankaccount.money);
    // methods from sub class are not available to super class
    checking check=new checking();
    check.money=7782;
    check.accountNumebr=7865768;
    check.deposit();
    check.transfer();

   Savings save=new Savings();
   save.accountNumebr=12345567;
   save.money=2343;
   save.profit=23;
   // save.interest=0; error because  not accessible to another subclass
   save.deposit();
   save.takeprofit();
   //save.transfer method is not available from another subclass.

    }
}
