/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists *PREPEND*
 * 4-12-18
 */

/*
 * NODE CLASS
 */

@SuppressWarnings("WeakerAccess")
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
     *     <T>
     */
    public Node(T value)
    {
        this.value = value;
        this.next = null;
        // this(value, null);
    }

    /**
     * Optional all value constructor.
     *
     * @param value
     *     <T>
     * @param next
     *     Node<T>
     */
    public Node(T value, Node<T> next)
    {
        this.value = value;
        this.next = next;
    }

    /**
     * @return Node<T>
     */
    public Node<T> getNext()
    {
        return this.next;
    }

    /**
     * @param next
     *     Node<T>
     */
    public void setNext(Node<T> next)
    {
        this.next = next;
    }
    /**
     * @return
     */
    // Begin Getters and Setters

    /**
     * @return <T>
     */
    public T getValue()
    {
        return this.value;
    }

    /**
     * @param value
     *     T
     */
    public void setValue(T value)
    {
        this.value = value;
    }
}
