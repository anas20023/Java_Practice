class Animalia{
    String name;
//    public void setName(String name){
//        this.name=name;
//    }
    public String getName(){
        return  this.name;
    }
}
class Cat extends  Animalia{
    public Cat(){
        System.out.println("Cat Appears");
    }
    public void set_Name(String name){
        this.name=name;
    }
    public  String get_Name(){
        return  this.name;
    }
}
public class Inheritation  {
    public static void main(String[] args){
        Cat c= new Cat();
        c.set_Name("Anas");
        System.out.print(c.get_Name());
    }
}
