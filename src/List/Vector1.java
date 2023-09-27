package List;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
Vector VC = new Vector();
//insert the element
VC.add("Test");
VC.add(2);
VC.add(4);
VC.add('F');
VC.add(true);
VC.add(44);
System.out.println(VC);
System.out.println(VC.size());
//Remove
VC.remove(4);
System.out.println(VC);
//System.out.println(VC.remove('F'));
//VC.re
System.out.println(VC);
//update
VC.set(1, 22);
System.out.println(VC);
VC.add(3,"WE");
System.out.println(VC);
System.out.println("Reading the elementusingfor loop");
for(int i=0;i<VC.size();i++){
System.out.println(VC.get(i));
}
	}

}
