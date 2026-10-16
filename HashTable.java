/**
 * Implements the symbol table.
 *
 * @author Daniela Alvarez, 6304985, and COP3530 U01
 */
public class HashTable
{
    private final LinkedList[] table;    //hash table
    private final int tableSize;         //hash table size
    private final int hashConstant = 31; //hash constant used in hash function

    /**
     * Parameterized constructor.Sets this hash table as an empty one. Size of
     * the table is set to given size.
     *
     * @param size size of array defined by user
     */
    public HashTable(int size)
    {
        this.tableSize = size;
        table = new LinkedList[size];

        for (int i = 0; i < size; i++){
            table[i] = new LinkedList();
        }
    }

    /**
     * Adds a string to this hash table.
     *
     * @param str given string
     */
    public void add(String str)
    {
        int index = hash(str);
        table[index].add(str);
    }

    /**
     * Determines the hash value of a given string of characters.
     *
     * @param key string
     * @return hash value of key
     */
    private int hash(String key)
    {
        int hashVal = 0;

        for (int i = 0; i < key.length(); i++)
        {
            hashVal = hashConstant * hashVal + key.charAt(i);
        }

        hashVal %= tableSize;
        if (hashVal < 0)
            hashVal += tableSize;

        return hashVal;
    }

    /**
     * Removes from this hash table the given string, if found.
     *
     * @param str given string
     */
    public void remove(String str)
    {
        int index = hash(str);
        table[index].remove(str);
    }

    /**
     * Determines if given string is in this hash table.
     *
     * @param str given string
     * @return true if search is successful, false otherwise
     */
    public boolean search(String str)
    {
        int index = hash(str);
        return table[index].search(str);
    }

    /**
     * Constructs a String description of this hash table.
     *
     * @return String containing the hash table elements.
     */
    public String toString()
    {
        String str = "";

        for (int i = 0; i < table.length; i++)
        {
            str = String.format(str + "%2d: ", i);

            str += table[i] + "\n";
        }

        return str;
    }
}