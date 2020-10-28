class employee{
    String Name;
    int salary;
    employee(){
        salary=90000;
        Name="yasiru";
    } 

}
class programmer extends employee{
    int bonus;

    programmer(){
        bonus=45000;
    }

    void display(){
        System.out.println("programmer total salari is Rs:"+(salary+bonus));

    }
    
} 
class inherit{
    public static void main(String args[]){
        programmer p1=new programmer();
        p1.display();
        p1.display();
    }
}