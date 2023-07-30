package java8.interfaces;

/**
 * StaticMethodInf interface containing static methods
 */
interface StaticMethodInf{
    void status();

    // belong to memory area
    static void display(){
        System.out.println("Hello Static Method!");
    }

}

/**
 * StaticMethods class implements interface
 */
public class StaticMethods implements StaticMethodInf{

    @Override
    public void status(){
        System.out.println("Status method called!");
    }

    public static void main(String[] args) {
            StaticMethodInf.display();
            new StaticMethods().status();
    }
}
