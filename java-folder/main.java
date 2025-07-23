class Student{
    String name;
    int age;
    
    

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

   public void printinfo(String name, int age ){
    System.out.println(name+" " +age);
   }
}

public class main{
    public static void main(String []args){
        
        Student std = new Student();
        std.name = "ankush";
        std.age = 14;

        std.printinfo(std.name, std.age);
    }
  

}