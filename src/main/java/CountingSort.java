import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

//class that ordered an array of number between Counting Sort
public class CountingSort {

	
	public CountingSort(){
		
	}
	
	public List<Integer> countingAlgorithm(int unordered[]){
		
		// Initialize an HashMap and ordered array(the final array), defining app List
		// used to populate hashMap
		List<Integer> ordered = new ArrayList<Integer>(unordered.length);
		HashMap<Integer,List<Integer>> temp = new HashMap<Integer,List<Integer>>();
		List<Integer> app;
		try {
			
			for(int i = 0; i < unordered.length; i++){
				
				int element = unordered[i];
				
				if(!temp.containsKey(element)){
					
					app = new ArrayList<Integer>();
					app.add(element);
					temp.put(element,app);
				}
				else
					temp.get(element).add(element);
			}
		} catch (Exception e) {
			
			e.getMessage();
		}
		System.out.println(temp.toString());
		// When i'm trying this code the first time, 
		 // I remembered that hashMap has a naturally ordered about keys
		 // below an alternative method that i did to order a keySet
		Set<Integer> setKeys = temp.keySet();
		Integer[] arrayKeys  = setKeys.toArray(new Integer[setKeys.size()]);
		Integer intApp;
		
		try {
			for (Integer i = 0; i < arrayKeys.length-1; i++) {
				for (Integer j = 1; j < arrayKeys.length; j++) {
					
						if(arrayKeys[i] > arrayKeys[j]  ){
							
							intApp = arrayKeys[j].intValue();
							arrayKeys[j] = arrayKeys[i].intValue();
							arrayKeys[i] =  intApp.intValue();
							j++;
						}
						else
							j++;
				}

			}
			
			// to print array of integer i can use StringBuilder
			// I did it to ensure proper sorting
			StringBuilder builder = new StringBuilder();
			for (int i : arrayKeys) {
			  builder.append(",").append(i);
			}
			String text = builder.toString();
			System.out.println(text);
		} catch (Exception e) {
			
			e.getMessage();
		}
		//add all list of value contained in HashMap into List ordered
		try {
	
			for (Integer i : arrayKeys) {
				
			ordered.addAll(temp.get(i));
			}
		} catch (Exception e) {
			e.getMessage();
		}
		System.out.println(ordered.toString());
		
		return ordered;
	}
// main to do a try 
public static void main(String[] args)
{
	int[] a = {30,20,30,30,30,20,1};
	
	CountingSort prova = new CountingSort();

    prova.countingAlgorithm(a);
}
}