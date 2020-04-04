package com.bilisimegitim.sayisalloto;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class SayisalLoto {

	public static final int SAYISAL_BOY = 49;
	
	
	public static final int ARRAY_BOY = 6;
	
	
	
	public static int[] arrayDoldur()
	{
		
		int[] sayilar = new int[SayisalLoto.ARRAY_BOY]; 
		
        int rastgeleSayi;
		
		
		for (int i = 0; i < sayilar.length; i++) {
			
				
				do {
					rastgeleSayi = SayisalLoto.sayiGetir(SayisalLoto.SAYISAL_BOY);
				} while (SayisalLoto.arraydeVarmı(sayilar, rastgeleSayi));
				
				
				sayilar[0] = rastgeleSayi;
				
			}
		
		
		return sayilar;
		
	}
	

	public static boolean arraydeVarmı(int[] p_array, int p_sayi) {

		// Arama yapmadan Önce siralama yapmak zorunlu!

		arraysirala(p_array);

		int sonuc = Arrays.binarySearch(p_array, p_sayi);

		if (sonuc >= 0)
			return true;
		else
			return false;

	}

	public static int[] arraysirala(int[] p_array) {

		Arrays.sort(p_array);
		
		return p_array;

	}

	public static int sayiGetir(int p_sayi) {
		int sayi = 0;

		Random rand = new Random();

		sayi = rand.nextInt(p_sayi) + 1;

		return sayi;

	}

	public static void arrayYazdir(int[] p_array) {
		
	

		SayisalLoto.arraysirala(p_array);

		for (int i = 0; i < p_array.length; i++) {

			System.out.print(p_array[i] + "-");

		}

	}
	
	public static void arrayGUIYazdir(int[] p_array) {

		SayisalLoto.arraysirala(p_array);
		
		String sonuc ="";
		
				

		for (int i = 0; i < p_array.length; i++) {

			sonuc =sonuc + p_array[i]+" // ";
			
		
		}

		JOptionPane.showMessageDialog(null, sonuc,"SAYISAL LOTO SONUCLARI",JOptionPane.INFORMATION_MESSAGE);
		
	}
}