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

class principle extends teacher{
    void display(){
        System.out.println("This is Principle class");
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

        st=new principle();//multy level inheritance 
        st.display();
    }
}