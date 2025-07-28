abstract class Animal{
    String name="Animal Class";
    public abstract void Get_Name();
    public void sleep() {
        System.out.println("Zzz");
    }
}
class Dog extends Animal{
    public  Dog(String s){
        super();
        name=s;
        System.out.println(name);
    }
    public  void Get_Name(){
        System.out.println("Dog is Meawing");
    }
}
public class Abstract {
    public static void main(String[] args){
        Dog d= new Dog("Huskey");
        d.Get_Name();
        d.sleep();
    }
}
