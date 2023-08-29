package JavaCollectionFramework;

import java.util.Stack;

public class stack {
    
    public static void main(String ...args) {

        Stack<String> animals = new Stack<>();

        // Adding an element into stack.
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Dog");

        System.out.println(animals);

        // Reading top element in stack.
        System.out.println(animals.peek());

        // Removing top element from stack.
        System.out.println(animals.pop());
        System.out.println(animals);

    }
}
