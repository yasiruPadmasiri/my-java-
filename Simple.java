


class Simple{  
    public static void main(String args[]){  
    
    //hello java 

     System.out.println("Hello Java");
     System.out.println("helllo Yasiru");
    
            
            // varible in java
            int a=10;
            int b=20;
            float f=20.34f;
            float G=20.9f;

            int d=(int)f; //typecasting
            int h=(int)G;

            System.out.println(a+b);
            System.out.println(d);
            System.out.println(f);
            System.out.println(h);
            System.out.println(a++);


            //switch case  simple 
            
            switch (b) {
                case 10:
                System.out.println("value is 10");
                    
                    break;
                case 20:
                System.out.println("B's value is 20");    
            
                break;
                default:

                    System.out.println(" Value is un defined");
                    break;
            }
            //for loop//
            for (int i=0;i<10;i++){
                System.out.println(i);
            }
            for(int i=0;i<10;i++){
                 for(int j=0;j<5;j++){
                     System.out.println(j+1);
                 }
                 System.out.println("\n");
            }

            // star patten using for
            for (int i=0;i<5;i++){
                for(int j=i;j<5;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            
            for (int i=0;i<5;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


    }  
}