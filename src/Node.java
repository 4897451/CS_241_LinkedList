/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists *PREPEND*
 * 4-12-18
 */

/*
 * NODE CLASS
 */

public class Node<T> {
    Node<T> next;
    T value;

    /**
     * Default values constructor.
     */
    public Node()
    {
        this(null, null);
    }

    /**
     * Value only constructor.
     *
     * @param value
     */
    public Node(T value)
    {
        this.value = value;
        this.next = null;
        // this(value, null);
    }

    // Optional
    public Node(T value, Node<T> next)
    {
        this.value = value;
        this.next = next;
    }

    /**
     * @return
     */
    public Node<T> getNext()
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
    public T getValue()
    {
        return this.value;
    }

    /**
     * @param value
     */
    public void setValue(T value)
    {
        this.value = value;
    }
}
