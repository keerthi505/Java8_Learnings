package DefaultMethod;

public class DefaultDemo implements Parent {
public void sayHello(){
    System.out.println("hi from child");
}
    public static void main(String[] args){
        DefaultDemo ob =new DefaultDemo();

        //Parent p = new DefaultDemo();
        //p.sayHello(); // we can use this way also still its prints child msg
        ob.sayHello(); // we can directly call default methods without overding
        //and we can also overide them.


    }

}

