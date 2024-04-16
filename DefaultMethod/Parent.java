package DefaultMethod;

public interface Parent {

    default void sayHello(){
        System.out.println("hi from parent");
    }
}
