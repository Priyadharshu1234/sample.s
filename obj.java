class Student{
    String name;
    int age;
    Student(){
        name="default";
        age=22;
    }
     Student(String n,int a){
        this.name=n;
        this.age=a;
        }
        public void display(){
       System.out.println("Name: "+name+" Age: "+age);
       }
}
public class obj{
   public static void main(String[]args){
Student Student1=new Student(n:"Test1",a:20);
Student1.name="Test1";
Student1.age=20;
Student1.display();
}
}