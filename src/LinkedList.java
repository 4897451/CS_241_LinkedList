/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists *PREPEND*
 * 4-11-18
 */

/**
 * linkedlist class
 * <p>
 * Jonathan, This should be a T for type because it is a type
 * but I understand you chose L because it makes sense to you at this point
 * If Anything, for the future, use S Since this is a "second"
 * and this would keep better in naming conventions
 */
@SuppressWarnings("WeakerAccess")
public class LinkedList<L> {
    private Node<L> head;

    /**
     * Constructor
     */
    public LinkedList()
    {
        this.head = null;
    }

    /**
     * @param value
     *     <L> Passes (Value) into append method | Main property.
     */
    public void append(L value)
    {
        /*
         * If the list is empty set the head to new mode
         */
        if (this.head == null)
        {
            // Creates a new node and stuffs Value into it
            this.head = new Node<>(value);
            return;
        }
        Node<L> traveler = getLast();

        /*
         * At this point, traveler points to last node
         */
        traveler.setNext(new Node<>(value));
    }

    /**
     * Got last linked node.
     *
     * @return Node<L>|null Returns Node or NULL.
     */
    public Node<L> getLast()
    {
        /*
         * Finds the last Node
         */
        Node<L> last = this.head;
        while (last.getNext() != null)
        {
            last = last.getNext();
        }
        return last;
    }

    /**
     * PREPEND METHOD
     *
     * @param value
     *     <L> Value for the node.
     */
    public void prepend(L value)
    {
        if (this.head == null) // Checks to see if its the only node
        {
            this.append(value);
        } else
        {
            // This is a way to increase efficiency of my code.
            // Instead of create a temporary local variable to assign to the new
            // node's next you can do it in a single step by using the other node constructor.
            // Instead I didn't need to create an empty node
            // and assign the value of head to next and then discard
            // the temporary pointer to the old node.
//            Node<L> temp = this.head; *Deprecated*
            this.head = new Node<>(value, this.head);
//            this.head.setNext(temp); *Deprecated*
        }
    }

    /**
     * Print LinkedList Method
     */
    public void print()
    {
        Node<L> traveler = this.head;
        while (traveler != null)
        {
            System.out.print("/Value(" + traveler.getValue() + ")--->");
            //System.out.print(traveler); *test* <-Traveler at this point

            /*
             * This extra line below will output a hash of the memory
             * address of the nodes (heads)
             */
            System.out.print(traveler.getNext() + "");
            traveler = traveler.getNext();
            //System.out.print(traveler); *test* <-Traveler at this point
        }
        System.out.println();
    }

        /*
        public void insert(int value, int position)
        {
        }
        */

    /**
     * @param index
     *     int
     *
     * @return <L>
     */
    public L removeAt(int index)
    {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        if (index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<L> trailer = null;
        Node<L> traveler = this.head;
        int position = 0;
        while (traveler != null && position != index)
        {
            trailer = traveler;
            traveler = traveler.next;
            ++position;
        }
        if (traveler == null)
        {
            throw new IndexOutOfBoundsException();
        }
        if (trailer == null)
        {
            L value = this.head.value;
            this.head = this.head.next;
            return value;
            // return this.removeFirst();
        }
        L value = traveler.value;
        trailer.next = traveler.next;
        return value;
    }

    /**
     * @return <L>
     */
    public L removeFirst()
    {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        /*
         * this will create a new local var
         * of the Node type
         * this.head passes the value of the "next"
         * from the first Node to removedNode local var
         */
        Node<L> removedNode = this.head;
        /*
         * this takes the value of head from the 2nd Node
         * and makes it the value of Head for the Second Node?
         */
        this.head = this.head.next;
        /*
         * this takes the value of Next from the First node
         * and makes its Next Null
         * thus severing it completely from the Linked List
         */
        removedNode.next = null;
//        return removedNode;
        // Node removedNode = this.head;
//        int value = this.head.value;
//        this.head = this.head.next;
        return removedNode.value;
//        return value;
    }
    /*INSERT
     *
     */

    /**
     * @return <L>
     */
    public L removeLast()
    {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        if (this.head.next == null)
        {
            /*
            int value = this.head.value;
            this.head = null;
            return value;
            */
            return this.removeFirst();
        }
        // Find second to last Node
        Node<L> traveller = this.head;
        while (traveller.next.next != null)
        {
            traveller = traveller.next;
        }
        Node<L> secondToLastNode = traveller;
        Node<L> lastNode = traveller.next;

        /*
         Remove pointer from second to last Node,
         to last Node
         */
        L value = lastNode.value;
        secondToLastNode.next = null;
        return value;
    }

    /**
     * @return <L>
     */
    public L removedLast2()
    {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        Node<L> traveler = this.head;
        Node<L> trailer = null;
        while (traveler.next != null)
        {
            trailer = traveler;
            traveler = traveler.next;
        }
        if (trailer == null)
        {
            L value = traveler.value;
            this.head = null;
            return value;
        } else
        {
            L value = traveler.value;
            trailer.next = null;
            return value;
        }
    }
}