public class StaricKewyowrdDemo implements StaticDemo {
    public static void main(String[] args){
        StaricKewyowrdDemo st= new StaricKewyowrdDemo();
        //st.keerthi(); // we cannot call direclty static methos of an interface with help
        //of object

        //we cannot call with the help of class name
        //StaricKewyowrdDemo.keerthi();

        //we cannot override them

    }
    static void keerthi(){
        //class implemting dont know the presecnce f static method
        //we cannot override them even if we do it will treat it as new class method
        System.out.println("hi");
    }
}
