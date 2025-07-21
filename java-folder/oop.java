class Car{
    String color;
    String brand;
    //constructor

     Car(String color, String brand){
        System.out.println("The color of the car is "+color);
        System.out.println("The brand of the car is "+brand);
    }
}

class Student{
    String name;
    int age;
    int pclass;
    //constructor
        
    Student(String name, int age, int standard){
        System.out.println("The name of the student is "+name);
        System.out.println("The age of the student is "+age);
        System.out.println("The standard of the student is "+standard);
    }

    }


public class oop{
   

    public static void main(String[] args) {
        //the advanced way of assigning the value of those variables which help for anything, i don't know about that
       
     Car car = new Car("blue", "PORSCHE");

      Student std = new Student("ankush", 14, 9);
    //   std.age = 14;
    //   std.pclass = 9;
    //   std.name = "ankush";
        

      
    }
}
