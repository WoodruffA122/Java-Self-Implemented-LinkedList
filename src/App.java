
//import java.util.Arrays;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LinkedStringList list = new LinkedStringList();
        
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        list.moveFirst();
        list.setCurrentValue("Red");
        list.moveNext();
        list.setCurrentValue("Green");
        list.moveNext();
        list.setCurrentValue("Blue");
        
        System.out.println("Index of: "+list.indexOf("Green"));
        System.out.println();
        
        list.displayList();
        System.out.println();
        
        list.sortAscending(list);
        list.displayList();
        System.out.println();
        
        list.remove();
        list.remove();
        
        list.displayList();
        
        //  Code for calling string seection sort
        //String[] arr = {"banana", "dragonfruit", "cantaloupe", "apple"};
        //stringSelectionSort(arr);
        //System.out.println(Arrays.toString(arr));
    }
    
    
    //  Test selection sort with Strings
//    public static void stringSelectionSort(String[] arr)
//    {
//        for (int i = 0; i < arr.length - 1; ++i)
//        {
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; ++j)
//            {
//                if (arr[j].compareTo(arr[minIndex]) < 0)
//                {
//                    minIndex = j;
//                }
//            }
//            String temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//    }
    
}

