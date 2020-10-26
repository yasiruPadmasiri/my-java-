class account{
    int accountNo;
    float amount;
    String Name; 
     void insert(int No,float amt,String name){
        accountNo=No;
        amount=amt;
        Name=name;
     }
     void deposit(float amt){
         amount=amount+amt;
         System.out.println("Your account balance is "+amount);
     }
     void cheackBalance(){
         System.out.println("Your account balance is "+amount);
     }
     void withDraw(float amt){
         if (amount<=amt){
             System.out.println("your acount balance is not sufficient for it ");
         }
         else{
            amount=amount-amt;
            System.out.println("your balance is "+amount);
        }
     }
}
class bank{
    public static void  main(String args[]){
        account acc=new account();
        acc.insert(855544,450000,"Yasiru");
        acc.cheackBalance();
        acc.deposit(500);
        acc.withDraw(1000);
    }
}