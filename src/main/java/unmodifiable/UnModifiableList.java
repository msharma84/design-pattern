package unmodifiable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModifiableList {

	public static void main(String[] args) {
		
		String[] lang = new String[]{"A","B","C"};
		List<String> myList = Arrays.asList(lang);
		
		try {
			myList.add("D");
		}catch(UnsupportedOperationException usoe) {
			System.err.println("java.lang.UnsupportedOperationException");
		}
		
		myList.set(0,"X");
		
		System.out.println("List : "+myList);
		
		lang[1] ="Y";
		
		System.out.println("Array : " + Arrays.toString(lang));
		System.out.println("List Again : "+myList);
		
		List<String> mutableList = new ArrayList<>(
                Arrays.asList("C", "C++", "Java"));

		List<String> unmodifiableList =
                Collections.unmodifiableList(mutableList);
		
		 try {
	            // any attempt to modify the list will result in
	            // an `UnsupportedOperationException`
	            unmodifiableList.add("C#");
	        }
	        catch (UnsupportedOperationException ex) {
	            System.out.println("java.lang.UnsupportedOperationException");
	        }
		 
		// any changes made to the original list will be reflected
	        // back in the unmodifiable list
        mutableList.add("Go");
	 
        System.out.println(unmodifiableList);
	}
}
