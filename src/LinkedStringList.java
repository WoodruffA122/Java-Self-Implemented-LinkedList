import java.util.NoSuchElementException;
public class LinkedStringList 
{
    private Node first;
    private Node currentNode;   
    private int length;
   
    class Node
    {
        private String data;
        private Node next;
      
        public void printNodeData()
        {
            System.out.println("Node data: " + data);
        }
        public Node getNext()
        {
            return next;
        }
    }   
    public LinkedStringList()
    {
        first = null;
        currentNode = null;
        length = 0;
    }
    public void addFirst(String value)
    {
       
        //create the Node and set its value
        Node newNode = new Node();
        newNode.data = value;
       
        // if newNode is the first node, this will be null
        // otherwise it will point to the former "first" now
        newNode.next = first; 
        
        //set our "first" Node to the Node we just created
        first = newNode;
       
        currentNode = newNode;
       
        length++;
        
    }    
    
    public void setFirstValue(String value)
    {
        first.data = value;
    }
    public void setCurrentValue(String value)
    {
        currentNode.data = value;
    }

    public void moveNext()
    {
        if (currentNode.next == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            currentNode = currentNode.next;
        }
    }
   
    public void moveFirst()
    {
        currentNode = first;
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
  
    public int getLength()
    {
        return length;
    }
   
    public String getFirstValue()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return first.data;
        }
    }
  
    public String getCurrentValue()
    {
        if (currentNode == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return currentNode.data;
        }
    }
  
    public void displayList()
    {
        Node currentNode = first;
        System.out.println("List contents:");
        while (currentNode != null)
        {
            currentNode.printNodeData();
            currentNode = currentNode.getNext();
        }
    }
    
    //==========================================================================================
    
    public void add(String value)
    {
        if (first == null)
        {
            addFirst(value);
        }
        else
        {
            Node newNode = new Node();
            
            newNode.data = value;
            newNode.next = currentNode.next;    //next of the new node should equal the next of the current node
           currentNode.next = newNode;  //assign the newNode to the next of current node
            
            moveNext();
        }
    }
    
    public void removeFirst()
   {
      Node temp = first;
      first = first.next;
   }
    
    public void remove()    //null pointer
    {
        if (currentNode == first)
            removeFirst();
        else
        {
            boolean found = false;
            Node temp = currentNode;
            moveFirst();
            while(!found)
            {
                if (currentNode.next == temp)
                {
                    found = true;
                }
                else
                {
                   moveNext(); 
                }
            }
            //currentNode.data = temp.data;
            currentNode.next = temp.next;
        }
        
    }
    
    public int indexOf(String value) 
    {
        int index = 0;
        Node current = first;
        while (current != null) 
        {
            if (current.data.equals(value)) 
            {
                return index;
            }
            index++;
            current = current.next;
	}
	return -1;
    }
    
    public void sortAscending(LinkedStringList list)
    {
        for (int i = 0; i < list.length - 1; ++i)
        {
            int minIndex = i;
            for (int j = i + 1; j < list.length; ++j)
            {
                if (currentNode.data.compareTo(currentNode.next.data) < 0)
                {
                    minIndex = j;
                }
            }
            String tempString = currentNode.data;
            currentNode.data = currentNode.next.data;
            currentNode.next.data = tempString;
        } 
    }
    
    
}
