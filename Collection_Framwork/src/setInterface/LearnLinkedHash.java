package setInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHash {
	public static void main(String[] args) {
	Set<Integer>set=new LinkedHashSet<>();
	set.add(90);
	set.add(60);
	set.add(70);
	set.add(20);
	
	System.out.println(set);
	set.remove(90);
	System.out.println(set);
	System.out.println(set.contains(20));
	System.out.println(set.isEmpty());
	System.out.println(set.size());
	
	}
}
