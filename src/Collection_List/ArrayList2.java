package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
ArrayList AL = new ArrayList();
AL.add("A");
AL.add("D");
AL.add("C");
AL.add("Z");
AL.add("S");
System.out.println(AL);
// Addall
ArrayList duplicate = new ArrayList();
duplicate.add(AL);
System.out.println(duplicate);
//2.Removeall
duplicate.removeAll(AL);
System.out.println(duplicate);
//3.Collections
System.out.println(AL);
Collections.sort(AL);
System.out.println(AL);
//
//Collections.sort(AL);
System.out.println(AL);
//
Collections.shuffle(AL);
System.out.println(AL);
	}

}
