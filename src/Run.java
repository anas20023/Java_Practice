class Animall {
    public void sound(){
        System.out.println("Animal is Making Noice");
    }
}
class Dog extends Animall{
    //@Override
    public void sound() {
        //super.sound();
        System.out.println("This is Dog Speaking !!");
    }
}

class Run {
    public  static  void main(String[] args){
        Dog md=new Dog();
        md.sound();
    }
}
