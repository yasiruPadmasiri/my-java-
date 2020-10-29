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
class aggregresion{
    public static void main(String args[]){
        circle cr=new circle();
    double result=cr.area(7);
    System.out.println(result);
    }
}