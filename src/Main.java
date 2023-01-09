
public class Main {
	
	//static int a;
	
	int a;
	static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape obj = new Shape();
		
//		Persegi obj = new Persegi(10);
//		obj.printArea();
//		
//		PersegiPanjang obj2 = new PersegiPanjang(10,5);
//		obj2.printArea();
//		obj2.testing();
//		
		/*
		obj.method(10,100);
		 */
//		classSub obj = new classSub();
//		obj.testing();
//		
//		//a=11;
//		b=10;
		
//		counting obj = new counting();
//		obj.tambah(10, 10);
//		obj.tambah(1,2,3,4);
//		obj.tambah(11);
//		obj.tambah(1,2,3,4,5);
		
//		overideAnak obj = new overideAnak();
//		obj.print();
		/*
		Overide itu menindih method di class parent dengan method di class anak, jika nama method tersebut sama.
		 */
		
		Encapsulations obj = new Encapsulations();
		obj.changeA(10);
		obj.changeA(100);
		System.out.println(obj.getA());
		
	}

}
