package Java;

	import java.util.HashSet;
	public class Hashsettt {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();

	        set.add("Priya");
	        set.add("Srinu");
	        set.add("sridevi");
	        set.add("nagesh");
	        set.add("Priya"); 
	        System.out.println("HashSet: " + set);
	        if (set.contains("Priya")) 
	        {
	            System.out.println("Priya is present in the HashSet.");
	        } else {
	            System.out.println("Priyaa is not present in the HashSet.");
	        }
	        set.remove("nagesh");
	        System.out.println("After removing 'nagesh': " + set);
	        System.out.println("Size of HashSet: " + set.size());
	        System.out.println("\nIterating over HashSet:");
	      for (String fruit : set) {
	            System.out.println(fruit);
	        }
	        set.clear();
	      System.out.println("After clearing, HashSet is empty: " + set.isEmpty());
	    }
	}
	