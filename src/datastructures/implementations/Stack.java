package datastructures.implementations;

/**
 * Stack class shows an example of stack custom implementation
 * with required methods
 */
public class Stack {

    /**
     * An array of string items which contains a list of items
     */
    private final String[] items;

    /**
     * An index of current item which is being pushed or popped
     */
    private int top = -1;

    /**
     * A size of stack initialization
     */
    private final int size;

    /**
     * Stack constructor with initial size of an array
     * @param size of items
     */
    public Stack(int size){
        this.size = size;
        items = new String[this.size];
    }

    /**
     * Add an item to the array
     * @param item can be a string
     */
    public void push(String item){
        if(isFull()){
            System.out.println("Stack is full!");
           return;
        }
        items[++top] = item;
    }

    /**
     * Take item from top and remove it from an array
     * @return a string item
     */
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }

        return items[top--];
    }

    /**
     *  Get item and don't remove it
     * @return top value
     */
    public String peek(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
            return null;
        }

        return items[top];
    }

    /**
     * Check array is full
     * @return boolean flag either true or false
     */
    private boolean isFull(){
        return top == size - 1;
    }

    /**
     * Check If an array is empty
     * @return a boolean flag either it can be true or false
     */
    private boolean isEmpty(){
        return top == -1;
    }

    /**
     * Main method for testing purpose
     * @param args takes command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek() + " - Peek");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
