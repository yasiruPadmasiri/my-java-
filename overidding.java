class student{
    void display(){
        System.out.println("this is student");
    }
}
class subject extends student{
    void display(){
        System.out.println("this is subject class");
    }
}
class sport extends student{
    void display(){
        System.out.println("this is sport class");
    }
}
class overide{
    public static void main(String args[]){
        student std=new student();
        subject sbj=new subject();
        sport spr=new sport();

        std.display();
        sbj.display();
        spr.display();
    }
}