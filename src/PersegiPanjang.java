
public class PersegiPanjang extends Shape{
	
	int panjang,lebar;
	
	PersegiPanjang(int a, int b){
		this.panjang=a;
		this.lebar=b;
	}
	
	
	public void printArea() {
		System.out.println(this.lebar*this.panjang);
	}
	
//	public void printArea(int l,int r) {
//		System.out.println(l*r);
//	}
	
}
