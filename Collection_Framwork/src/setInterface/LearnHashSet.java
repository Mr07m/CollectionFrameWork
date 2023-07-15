package setInterface;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
	public static void main(String[] args) {
	Set<Integer>set=new HashSet<>();
	set.add(89);
	set.add(20);
	set.add(76);
	set.add(67);
	System.out.println("Adding Element:"+set);
	set.remove(67);
	System.out.println("Remove Element: "+set);
	System.out.println("Containe Element: "+set.contains(20));
	System.out.println("Check Set is empty or not: "+set.isEmpty());
	System.out.println("Set Size: "+set.size());
	set.clear();
	System.out.println("After Clear: "+set);
	
	}
}
