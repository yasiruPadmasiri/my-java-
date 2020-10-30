class emp{
    int id;
    String Name;
    emp(int id , String Name){
        this.id=id;
        this.Name=Name;
    }
}
class Salary extends emp{
    int salary;
    Salary(int id,String Name, int salary ){
        super(id,Name);
        this.salary=salary;
    }
    void display(){
        System.out.println("id "+id+"\nName "+Name+"\nSalary "+salary);
    }
}
class superReal{
    public static void main(String args[]){
         Salary sal=new Salary(1,"yasiru",95000);
         sal.display();
    }
}