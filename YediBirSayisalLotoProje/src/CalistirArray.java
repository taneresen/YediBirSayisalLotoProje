
import java.util.Random;

import com.bilisimegitim.sayisalloto.SayisalLoto;

public class CalistirArray {

	public static void main(String[] args) {
		
		
		int sayilar[] = new int[6];
		
		int sayi;
		
		SayisalLoto loto = new SayisalLoto();
		
		sayi=loto.sayiGetir(49);
		
		
		while (loto.arraydeVarmı(sayilar, sayi))
			
		{
			sayilar[1] = loto.sayiGetir(49);
		}
		
		
		do {
			sayilar[2] = loto.sayiGetir(49);
		} while (loto.arraydeVarmı(sayilar, sayilar[2]));
		
		
		do {
			sayilar[3] = loto.sayiGetir(49);
		} while (loto.arraydeVarmı(sayilar, sayilar[3]));
		
		
		do {
			sayilar[4] = loto.sayiGetir(49);
		} while (loto.arraydeVarmı(sayilar, sayilar[4]));
		
		
		do {
			sayilar[5] = loto.sayiGetir(49);
		} while (loto.arraydeVarmı(sayilar, sayilar[5]));
		
		
		
		
		
		
		
		
		// Yazdir
		System.out.println(sayilar[0]+"-"+sayilar[1]+"-"+sayilar[2]+"-"+sayilar[3]+"-"+sayilar[4]+"-"+sayilar[5]);
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if(i==(sayilar.length-1))
				System.out.print(sayilar[i]);
			else
			
			System.out.print(sayilar[i]+"-");
			
		}
		
		
		

	}

}