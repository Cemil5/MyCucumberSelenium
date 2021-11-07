package day34_ConstructorsPassing;

class Complex {
	
	double re, im;
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
		System.out.println("Copy 1111");
	}
	
	Complex(Complex c){
		System.out.println("Copy constructor called");
		re = c.re;
		im = c.im;
	}
	
	public String toString() {
		return "(" + re + "+" + im + "i)";
	}
	



	public static void main(String[] args) {
		Complex c1 = new Complex(10,150);
		Complex c2 = new Complex(c1);
		Complex c3 = c1;
		System.out.println(c2.toString());
		
	}

}
