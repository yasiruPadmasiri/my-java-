class account{
    int accountNo;
    float amount;
    String Name; 

     account(){
        accountNo=997722;
        amount=500000;
        Name="yasiru";
    }

    account(int accountNo, float amount, String Name){
        this.accountNo=accountNo;
        this.amount=amount;
        this.Name=Name;
    }

    account(account a){ // ************copy constructor
        accountNo=a.accountNo;
        amount=a.amount;
        Name=a.Name;
    }

    account(int No,String name){
        accountNo=No;
        Name=name;
    }

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
         System.out.println("Your account balance is "+amount+"form "+Name);
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
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        account acc2=new account();
        acc2.withDraw(500);
        acc2.cheackBalance();

        account acc3=new account(101010,90000,"OKDYPadmasiri");
    
        acc3.cheackBalance();
        account acc4=new account(292929,"yasiru");       //constructor overloading
        account acc5=new account(acc);                  //copy object acc to acc5
        acc5.cheackBalance();
        System.out.println("\n");
        acc4.cheackBalance();
        System.out.println("\n");

        


    }
}
