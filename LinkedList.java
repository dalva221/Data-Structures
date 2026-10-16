/**
 * The class LinkedList implements a singly linked list of strings.
 * The list uses a header (dummy) node.
 *
 * @author Daniela Alvarez, 6304985, and COP3530 U01
 */
public class LinkedList
{
    /**
     * Implements the node of a singly linked list of string type.
     */
    private class Node
    {
        private String info;
        private Node next;

        public Node()
        {
            info = "<empty>";
            next = null;
        }

        public String getInfo()
        {
            return info;
        }

        public Node getNext()
        {
            return next;
        }

        public void setInfo(String info)
        {
            this.info = info;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }
    }

    private final Node first; //dummy header node

    /**
     * Default constructor. Sets this object as an empty list.
     */
    public LinkedList()
    {
        first = new Node();
    }

    /**
     * Adds given string as the first element of the list.
     *
     * @param str given string
     */
    public void add(String str)
    {
        Node newNode = new Node();
        newNode.setInfo(str);
        newNode.setNext(first.getNext());
        first.setNext(newNode);
    }

    /**
     * Determines if linked list is empty.
     *
     * @return true if list contains no elements, false otherwise.
     */
    public boolean isEmpty()
    {
        return first.getNext() == null;
    }

    /**
     * Removes given string from the list.
     *
     * @param str string to be removed
     */
    public void remove(String str)
    {
        Node prev = first;
        Node curr = first.getNext();

        while (curr.getNext() != null){
            if (curr.getNext().getInfo().equals(str)){
                prev.setNext(curr.getNext());
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
    }

    /**
     * Determines if given string is in the list.
     *
     * @param str given string
     * @return true if str is in the list, false otherwise
     */
    public boolean search(String str)
    {
        Node curr = first.getNext();
        while (curr.getNext() != null){
            return true;

            curr = curr.getNext();
        }
        return false;
    }

    /**
     * Constructs a String description of the list.
     *
     * @return String containing the list elements.
     */
    public String toString()
    {
        Node current = first.getNext();

        String str = "";
        while (current != null)
        {
            str += "[" + current.getInfo() + "]";
            current = current.getNext();

            if (current != null)
                str += " -> ";
        }

        return str;
    }
}
