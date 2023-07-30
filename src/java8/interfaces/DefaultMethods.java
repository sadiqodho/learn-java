package java8.interfaces;

/**
 * DefaultMethodInf1 contains default method
 */
interface DefaultMethodInf1{

    // Belongs to instance of its implementation class
    default void display(){
        System.out.println("Default method is here!");
    }
}

/**
 * DefaultMethodInf2 contains default method
 */
interface DefaultMethodInf2{

    // Belongs to instance of its implementation class
    default void display(){
        System.out.println("Default method is here!");
    }
}

/**
 * DefaultMethods implements two interfaces
 */
public class DefaultMethods implements DefaultMethodInf1, DefaultMethodInf2{

    @Override
    public void display(){
        System.out.println("Override clashes!");
    }

    public static void main(String[] args) {
        new DefaultMethods().display();
    }

}
