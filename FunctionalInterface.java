public class FunctionalInterface implements FI{

    public static void main(String[] args){
        FunctionalInterface F= new FunctionalInterface();
        F.sayHello();
        F.sayBonjour();
    }

    @Override
    public void sayHello() {
        System.out.println("hello from class");


    }

    //public void sayChao();since its implenting fi so
    // it cant have more than one abstract methods


}
