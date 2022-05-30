import java.util.*;

class Pen {
    String color;
    String type; //ballpen, gelpen
    int cost;
    public void write(){
        System.out.println("Write Something");
    }

    public void color(){
        System.out.println(this.color);  //this--> used to get to know which OBJECT is trying to access the method.
    }
}

class Student {
    String name;
    int age;
    int rollNo;

    void printInfo(){
        System.out.println("Name is: "+ this.name);
        System.out.println("Age is: "+this.age);
        System.out.println("Roll number is: "+this.rollNo);
    }

//    //non parameterized constructor
//    Student(){
//        System.out.println("this is non parameterized constructor...");
//    }

    //parameterized constructor
    Student(String name, int age, int rollNo){
        this.name = name;
        this.age= age;
        this.rollNo= rollNo;
    }
}


public class Oops {
    public static void main(String[] args){
//        Student s1= new Student();   //student() --> called constructor


        //constructor name and class name shoud be same
        //does not return anything and dont have any return type
        //constructor will call only once for one object


//        s1.name= "Shubham";
//        s1.age= 20;
//        s1.rollNo= 95;
//        s1.printInfo();



        //parameterized constructor
        Student s1= new Student("Shubham", 20, 95);
        s1.printInfo();


    }

}
