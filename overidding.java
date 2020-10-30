class student{
    int x;
    student(){
        System.out.println("Student is created");//constructor
    }
    student(int x){
        this.x=x;
        System.out.println("subject is created "+x);
    }
    void display(){
        System.out.println("this is student");
    }
}
class subject extends student{
    int y;
    subject(int y){
        this.y=y;
        System.out.println("subject is created "+y);
    }
    subject(){
        System.out.println("subject is created "+y);//constructor
    }

    void display(){
        System.out.println("this is subject class");
    }
}
class sport extends student{
    sport(){
        System.out.println("sport is created");//constructor
    }

    void display(){
        System.out.println("this is sport class");
        super.display();//super keyword using here
    }
}
class overide{
    public static void main(String args[]){
        student std=new student(10);
        subject sbj=new subject(8);
        sport spr=new sport();

        System.out.println("\n");
        std.display();
        sbj.display();
        spr.display();
        
    }
}