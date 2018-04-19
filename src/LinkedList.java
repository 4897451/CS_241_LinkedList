/*
 * Jonathan Jumper
 * CS241 JAVA II
 * Linked Lists *PREPEND*
 * 4-11-18
 */

/**
 * linkedlist class
 */
public class LinkedList {
    private Node head;

    /**
     * Constructor
     */
    public LinkedList()
    {
        this.head = null;
    }

    /**
     * @param value
     *     int Passes (Value) into append method | Main property.
     */
    public void append(int value)
    {
        /*
         * If the list is empty set the head to new mode
         */
        if (this.head == null)
        {
            // Creates a new node and stuffs Value into it
            this.head = new Node(value);
            return;
        }
        Node traveler = getLast();

        /*
         * At this point, traveler points to last node
         */
        traveler.setNext(new Node(value));
    }

    /**
     * Got last linked node.
     *
     * @return Node|null Returns Node or NULL.
     */
    public Node getLast()
    {
        /*
         * Finds the last Node
         */
        Node last = this.head;
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
     *     Value for the node.
     */
    public void prepend(int value)
    {
        if (this.head == null) // Checks to see if its the only node
        {
            this.append(value);
        } else
        {
            Node temp = this.head;
            this.head = new Node(value);
            this.head.setNext(temp);
        }
    }

    /*
     * PRINT LINKEDLIST METHOD
     */
    public void print()
    {
        Node traveler = this.head;
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
    public Node removeFirst()
    {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        /**
         * this will create a new local var
         * of the Node type
         * this.head passes the value of the "next"
         * from the first Node to removedNode local var
         */
        Node removedNode = this.head;
        /**
         * this takes the value of head from the 2nd Node
         * and makes it the value of Head for the Second Node?
         */
        this.head = this.head.next;
        /**
         * this make the value of Next from the First node
         * and makes its Next Null
         * thus severing it completely from the Linked List
         */
        removedNode.next = null;
        return removedNode;
        //Node removedNode = this.head;
//        int value = this.head.value;
//        this.head = this.head.next;
        //return removedNode.value;
//        return value;
    }

    public int removeLast()
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
        Node traveller = this.head;
        while (traveller.next.next != null)
        {
            traveller = traveller.next;
        }
        Node secondToLastNode = traveller;
        Node lastNode = traveller.next;

        /*
         Remove pointer from second to last Node,
         to last Node
         */
        int value = lastNode.value;
        secondToLastNode.next = null;
        return value;
    }
    /*INSERT
     *
     */

    public int removedLast2()
    {
        if (this.head == null)
        {
            throw new IndexOutOfBoundsException();
        }
        Node traveler = this.head;
        Node trailer = null;
        while (traveler.next != null)
        {
            trailer = traveler;
            traveler = traveler.next;
        }
        if (trailer == null)
        {
            int value = traveler.value;
            this.head = null;
            return value;
        } else
        {
            int value = traveler.value;
            trailer.next = null;
            return value;
        }
    }
}


/*
 * DROPPED / DEPRECATED CODE
 */


/*

 * Original LinkedList Print Method
 *
 * public void print()
 * {
 * 	Node traveler = this.head;
 * 	while (traveler != null) {
 * 	System.out.println(traveler.getValue());
 * 	traveler = traveler.getNext();
 * }
 * 	System.out.println();
 * }
 *

 */


