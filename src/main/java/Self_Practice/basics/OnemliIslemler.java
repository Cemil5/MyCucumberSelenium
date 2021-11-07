package basics;

public class OnemliIslemler {

	public static void main(String[] args) {
		
		byte b1 = 126;
        byte b2 = 1;
     // byte res1= b1+b2; //hata veriyor, operator (+) nedeniyle b1 ve b2'yi int olarak g�r�yor. 
        byte res2 = (byte)(b1 + b2); //casting required, b1, b2'nin i�inde ne oldu�una bakm�yor, int olarak d���n�yor.

        byte res3= 126 + 1;	//no casting required
     // byte res4= 126 + 2; //byte limiti d���na ��kt���ndan casting yap veya res4'� int'e d�n��t�r hatas� veriyor.
        
        final byte b3 = 120;
        final byte b4 = 7 ;
        byte b5 = b3 + b4; // final ile onu constant yap�nca, casting'e gerek kalmad�
        // iki byte veya iki short topland���nda otomatik sonu� integer'e d�n���yor, compiler yap�yor bunu.

        
        long l1 = 5000;	//suffix L is not necessary, 5000 is an integer as well.
        long l2 = -2222222222222223333L;	//suffix L is needed, bigger than int.
        long creditCardNumber = 5674_8756_8465_6646l;
        
        float f1 = 5, f3, f4, f5 = 2; //suffix f is not necessary, 6000 is an integer as well.
        float f2 = 2.5f; //suffix f is needed
        f3 = f1 + f2;  	// 7.5
        f4 = f1 + f2;	// 7.5
        f4 = f1 / f2;	// 2.0
     // f4 = 5 / 2.5;  	// hata veriyor
        f4 = 5 / 2.5f;	// 2.0
        f4 = 5 / 2;		// 2.0
        f4 = 5 / 2f;	// 2.5
        f4 = f1 / f5;	// 2.5
    //    f4 = (float) (f1) / f5; // 2.5
    //    f4 = (float) (f1 / f5); // 2.5
        
        double d3 = 2.1; 	//suffix f is not necessary	
		double d4 = 1/3; 	// 0.0
		d4 = 1/3.0; 		// 0.3333333333333333
		d4 = 1/3d; 			// 0.3333333333333333
		d4 = (double) 1/3; 	// 0.3333333333333333

		int i1=10, i2=4;
		double d1, d5 = 10, d6= 4;
		
		d1 = i1/i2; 			//2.0
		d1 = (double)i1/i2; 	//2.5	�nce i1'i double'a d�n��t�r�yor, sonra i�lemi yap�yor.
		d1 = i1/(double)i2; 	//2.5	�nce i2'yi double'a d�n��t�r�yor, sonra i�lemi yap�yor.
		d1 = (double)(i1/i2); 	//2.0	�nce int tipinde i�lemi tamaml�yor.
		d1 = d5/i2;				//2.5	d5 double oldu�u i�in i�lemi ondal�k k�sm� da dikkate alarak yap�yor.
		d1 = d5/d6; 			//2.5
		
		System.out.println(f4 + "  " + d1);
		
		d1 = i1 % i2; // 2.0 remainder or module
		i1 = i1 % i2; // 2 
				
		System.out.println(7/2);			//3
		System.out.println(7/2d);			//3.5
		System.out.println((int)(7.9) + (int)(6.7)); //13
		System.out.println((int)(7.9 + 6.7));		 //14
		System.out.println((int)(7.8 + (double)(15)/2));	//15
		System.out.println((double)(17));	//17.0
		System.out.println((double)(8+3));	//11.0
		System.out.println((double)(7)/2);	//3.5
		System.out.println((double)(7/2));	//3.0
	
		String word = "te�ekk�r ediyorum";
		System.out.print("\"Devrem, �ok "+ word + ".\""); // 	"Devrem, �ok te�ekk�r ediyorum."	
		System.out.println("\n\n\n\n");
		
		System.out.println(d4 + " " + d1 + " " + i1);
		System.out.println(res2 + "  " + res3 + "  " + f4);

	}

}
