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
        ll.print();
        ll.append(222);
        ll.append(333);
        ll.print();
        ll.prepend(444);
        ll.print();
        // ll.insert(7); *for insert assignment*
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
	    
		
		/*
		System.out.print("\nI changed the output above to reflect the value"
				+ " contained in the node\nand what the NEXT of that node is pointing towards.\n"
				+ "\nThis demonstrates that I have created a linked list and that each Node"
				+ "\is pointing to the next and that the last node is pointing to null.");
				*/
    }
}