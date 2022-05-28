package Com.KirubahomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionHW {

	public static void main(String[] args) {
		
		   List<Integer> al = new ArrayList<Integer>();  
		   al.add(13); 
		   al.add(24); 
		   al.add(22); 
		   al.add(33); 
		   al.add(5);
		   
		   System.out.println("List1 contain :-"+al);
		   
		   List<Integer> al2 = new ArrayList<Integer>();  
		   
		   al2.add(11);
		   al2.add(12);
		   al2.add(13);
		   al2.add(14);
		   al2.add(15);

		   
		   System.out.println("List2 contain :-"+al2);
		   System.out.println("Two ArrayList together: ");
		   
		   al.addAll( al2);
		   
		   for(int i = 0; i<al.size();i++) {
		
			 
			   System.out.println(al.get(i));  
		   }
		
		
		   Collections.sort(al);
		  
		   System.out.println("Ascending Order: " +al);
		   System.out.println("Number of index number 3: "+al.get(3));
		   System.out.println("Number of index number 6: "+al.get(6));
		   System.out.println("Number of index number 8: "+al.get(8));

	}

}
