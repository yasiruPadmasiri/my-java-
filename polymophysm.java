class student{
    void display(){
        System.out.println("this is a Student");
        System.out.println("\n");

    }
}
class primary extends student{
    void display(){
        System.out.println("this is primary class");
        System.out.println("\n");

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
        System.out.println("\n");

        
        st=new primary();
        st.display();
        System.out.println("\n");

        st.display();
        System.out.println("\n");
        System.out.println("\n");


        st=new teacher();
        st.display();
        System.out.println("\n");

        st.display();
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("\n");



        st=new principle();//multy level inheritance 
        st.display();
        System.out.println("\n");

        st.display();
    }
}