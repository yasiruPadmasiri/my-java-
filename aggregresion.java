class operation{
    int squre(int n){
        return n*n;
    }
}
class circle {
     double pi=3.14;


      double area(int radius){
        operation op;
        op=new operation();

          return op.squre(radius)*pi;
      }
}


class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class Emp{
    int id;
    String name;
    Address address;
    Emp(int id , String name , Address address ){
        this.id=id;
        this.name=name;
        this.address=address;

    }
    void display(){
        System.out.println("name: "+name+" id: "+id+" address: "+address.city+"\n");
        System.out.println("city: "+address.city+"\nState: "+address.state+"\ncountry: "+address.country);
    }

}


class aggregresion{
    public static void main(String args[]){
        circle cr=new circle();
    double result=cr.area(7);
    System.out.println(result);
    Address address1=new Address("Elpitiye","Galle","southern Country");
    Emp emp=new Emp(001,"yasiru",address1);
    emp.display();
    }
}