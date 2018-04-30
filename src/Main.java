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

import java.util.Random;

/**
 * Project main class.
 */
public class Main {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
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
        ll.print();
        System.out.println();
        System.out.println("* REMOVE FIRST *");
        ll.removeFirst();
        ll.print();
        System.out.println();
        System.out.println("* REMOVE LAST *");
        ll.removeLast();
        ll.print();
        //ll.insert(1,555);
        //System.out.println("* INSERT AT INDEX 1 *");

        /**
         * Random for insert method
         */
        System.out.println("\n* STARTING RANDOM *\n");
        Random r = new Random();
        for (int i = 0; i < 10; i++)
        {
            int value = r.nextInt(10);
            int position = r.nextInt(i + 1);
            ll.print();
            System.out.println("Inserting " + value + " at " + position);
            ll.print();
            ll.insert(value, position);
            // LL turns into null after 1st insertion
            ll.print();
        }
    }
}