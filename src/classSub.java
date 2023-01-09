
public class classSub extends classSuper{
	
	/*
	 * Class Java itu hanya mengenal variabel/attribut dan method
	 */
	
	public int a = 2;
	
	public int jumlah(int a,int b) {
		return a+b;
	}
	
	public void testing() {
		//int a = 1;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(this.a*super.a);
	}
	
	/*
	this.
	super.
	 */
}
