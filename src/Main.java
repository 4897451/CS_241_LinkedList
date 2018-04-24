/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists *PREPEND*
 * 4-12-18
 */

/*
 * <CREDITS>
 * This is the prepend method I build with inspiration
 * used by the resources below and some code by Nick Ferraro
 * and modified by Jonathan Jumper
 *
 *<SOURCES>
 * used prepend tutorial @
 * LinkedList in Java for Beginners Part 3 : Prepend Method
 * https://www.youtube.com/watch?v=jnc4BgWwW1M
 */

/*
 * These are here to remind me of some of the libraries
 * we may use
 *
 * import java.util.ArrayList;
 * import java.lang.reflect.Method;
 */

/*
 * MAIN METHOD
 */

public class Main {
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        // Node temp = new Node(1); *deprecated*
        ll.print();
        ll.append(111);
        System.out.println("* CREATED FIRST NODE *");
        ll.print();
        System.out.println();
        ll.append(222);
        ll.append(333);
        System.out.println("* Finished appending and creating the LinkedList. 111,222,333 *");
        ll.print();
        System.out.println();
        System.out.println("* Prepend Method (added 444 to beginning) *");
        ll.prepend(444);
        ll.print();
        System.out.println();
        System.out.println("* REMOVE AT INDEX 0 *");
        ll.removeAt(0);
        //ll.insertAfter(,555);
        ll.print();
        System.out.println();
        System.out.println("* REMOVE FIRST *");
        ll.removeFirst();
        ll.print();
        System.out.println();
        System.out.println("* REMOVE LAST *");
        ll.removeLast();
        ll.print();
    }
}