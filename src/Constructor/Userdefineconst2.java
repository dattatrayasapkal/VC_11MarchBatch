package Constructor;

public class Userdefineconst2 {
	//`var.dec,car specification
	String Name;
	String Model;
	int price;
	String Engin;
	public Userdefineconst2(String Name1,String Model1,int price1,String Engin1) {
		Name = Name1;
		Model = Model1;
		price = price1;
		Engin = Engin	;
		this.Name = Name;
		this.Model = Model;
		this.price = price;
		this .Engin = Engin;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userdefineconst2 UD1 = new Userdefineconst2("Kia","Seltos",200000,"Manual");
		Userdefineconst2 UD2 = new Userdefineconst2("Honda","City",190000,"Automatic");
		Userdefineconst2 UD3 = new Userdefineconst2("Tata","Nexon",1650000,"Manual");
		Userdefineconst2 UD4 = new Userdefineconst2("Maruti","800",500000,"Automatic");

		
		System.out.println(UD1.Name+" "+UD1.Model+" "+ UD1.price+" "+UD1.Engin);
		System.out.println(UD2.Name+" "+UD2.Model+" "+ UD2.price+" "+UD2.Engin);
		System.out.println(UD3.Name+" "+UD3.Model+" "+ UD3.price+" "+UD3.Engin);
		System.out.println(UD4.Name+" "+UD4.Model+" "+ UD4.price+" "+UD1.Engin);
		
	}

}
