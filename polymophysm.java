class student{
    void display(){
        System.out.println("this is a Student");
    }
}
class primary extends student{
    void display(){
        System.out.println("this is primary class");
    }

}
class teacher extends student{
    void display(){
        System.out.println("this is teacher");
    }

}
class polymophism{
    public static void main(String args[]){
        student st;
        st=new student();
        st.display();
        
        st=new primary();
        st.display();

        st=new teacher();
        st.display();
    }
}