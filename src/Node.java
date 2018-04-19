/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists *PREPEND*
 * 4-12-18
 */

/*
 * NODE CLASS
 */

public class Node {
    Node next;
    int value;

    public Node(int value)
    {
        this.value = value;
        this.next = null;
        // this(value, null);
    }

    // Optional
    public Node(int value, Node next)
    {
        this.value = value;
        this.next = next;
    }

    /**
     * @return
     */
    public Node getNext()
    {
        return this.next;
    }

    /**
     * @param next
     */
    public void setNext(Node next)
    {
        this.next = next;
    }

    /**
     * @return
     */
    // Begin Getters and Setters
    public int getValue()
    {
        return this.value;
    }

    /**
     * @param value
     */
    public void setValue(int value)
    {
        this.value = value;
    }
}
