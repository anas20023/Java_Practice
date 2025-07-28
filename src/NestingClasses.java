import java.util.*;
class OuterClass{
      class InnerClass{
        private String s;
       public void setS(String s){
            this.s=s;
        }
        public void getS() {
            System.out.println(s);
        }
    }
}
public class NestingClasses {
    public static  void main(String[] args){
        OuterClass outer=new OuterClass();
        OuterClass.InnerClass inner= outer.new InnerClass();
        inner.getS();
        inner.setS("Anas Ibn Belal");;
        inner.getS();
    }
}
