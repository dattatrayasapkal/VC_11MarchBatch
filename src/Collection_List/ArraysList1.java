package Collection_List;
import java.util.ArrayList;
import java.util.Iterator;
public class ArraysList1 {

	public static void main(String[] args) {
int arr[] = new int[5];// static + similar type data
ArrayList AL = new ArrayList();// dynaocarry = Hero and similar type data
ArrayList<String>AL1 = new ArrayList<String>();// Static ArrayList
//AL1.add("Java");
//AL1.add(true);
//AL1.add(33);
//1. Add- to add the element in arraylist
AL.add("welcome");// String
AL.add(200);// int
AL.add('A');// char
AL.add(300);//int
AL.add(null);//nul
AL.add(30.4);//double
System.out.println(AL);
//2.size-return the number of element in this list.
System.out.println("number of element in given arraylist--->"+AL.size());
AL.add(300);
AL.add(4000);
AL.add("Test");
System.out.println(AL.size());
//3. Remove
//syntax- RV.remove(elment);
System.out.println(AL);
AL.remove(30.4);
AL.remove(true);
System.out.println(AL);
//4.Insert new element
AL.add(2,20);
System.out.println(AL);
AL.add(3,"Python");
System.out.println(AL);
//5.Retrive secific element
// get--Return the element at the specified position in this list.
System.out.println(AL.get(4));
//System.out.println(AL.get(33));//// Index Out of bound Exception
System.out.println(AL.get(0));
//6.Replace /change method
//set
AL.set(3, "java");
System.out.println(AL);
AL.set(4, 1000);
System.out.println(AL);
//7.isempty
System.out.println(AL.isEmpty());// false
System.out.println(AL1.isEmpty()); //true
System.out.println();
//8.
// Read /print the data from arraylist
System.out.println("Reading element using for each loop");
//0<10- true
// 1<10-true
//10<10- false
for (int i=0;i < AL.size();i++);{
	System.out.println(AL.get(0));// 0-welcome,200
	// lor each loop
	System.out.println();
	System.out.println("Reading element using for each loop");
	for(Object obj:AL) {
		System.out.println(obj);
	System.out.println();
	System.out.println("Reading element using iterator");
	//iterator
	Iterator AL2 =  AL.iterator();
	while(AL2.hasNext()) {
		System.out.println(AL2.next());//20
		
		
	}
	}
	}

}

}
