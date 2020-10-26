class student{

        int id;
        String Name;
    
        
         void instertrecord(int iD, String name){
             id=iD;
             Name=name;
         }
         void displayInfo(){
             System.out.println( "id IS "+id);
             System.out.println("Name is "+ Name);
         }

}

class Rectangle{
    int height;
    int width;
     void instetData(int high, int wid){
         height=high;
         width=wid;
         System.out.println("id is "+height+" And Name is"+width);

     }

     void calculateArea(){
         System.out.println("area is "+height*width);
     }
}
 class testStudent{
     public static void main(String args[]){

        student s1= new student();
        System.out.println(s1.Name);
        System.out.println(s1.id);
        System.out.print("\n");

        s1.id=001;
        s1.Name="yasiru";

        System.out.println(s1.id+" Student is "+s1.Name);
        student s2=new student();
        
        s2.instertrecord(002,"Padmasiri");
        System.out.println(s2.id);
        System.out.println(s2.id +"  Student Name is "+s2.Name);
        s2.displayInfo();

        Rectangle rec1= new Rectangle();
        rec1.instetData(10,20);
        rec1.calculateArea();

        new Rectangle().instetData(20,10);// this is annonuomus functions call no view object 
     }

 }