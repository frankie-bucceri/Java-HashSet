// HashSet.java
// demonstrate the use and function of a hashset. Here we add names to a HashSet,
// get an iterator for the set, and search the set for names.

import java.util.*;


public class HashSetTest
{
   public static void main(String [] args)
   {
   // Create a hashset to hold names
   Set<String> nameSet = new HashSet<String>();
   
   // Add some names to the set
   nameSet.add("Chris");
   nameSet.add("Charlie");
   nameSet.add("Frankie");
   nameSet.add("Anthony");
   
   // Get an iterator for the set
   Iterator setiter = nameSet.iterator();
   
   // Display the elements in the set
   System.out.println("Here are the names in the set: ");
   while (setiter.hasNext())
   System.out.println(setiter.next());
   System.out.println();
   
   // Search for "Frankie" in the set. We should find this in the set
   if (nameSet.contains("Frankie"))
   System.out.println("Frankie is in the set.");
   else
   System.out.println("Frankie is not in the set.");
   
   // Search for "Franky" in the set. We should not find it in the set
   if (nameSet.contains("Franky"))
   System.out.println("Franky is in the set. ");
   else
   System.out.println("Franky is not in the set");
   } // End main()
} // End class