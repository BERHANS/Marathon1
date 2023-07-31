package com.berhan;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		ogrenciOzelListe liste = new ogrenciOzelListe();
		
		
		int secim=1;
		do {
			System.out.println("***************************************");
			System.out.println("**********ÖĞRENCİ BİLGİ SİSTEMİ********");
			System.out.println("***************************************");
			System.out.println();
			System.out.println("1-Sınıf Arkadaşı Tanımla");
			System.out.println("2-Hobileri Gir");
			System.out.println("3-Maaş Beklentisi gir");
			System.out.println("4-Sınıf Listesi");
			System.out.println("0-ÇIKIŞ");
			System.out.println();
			System.out.print("Seçim Yapınız: ");
			secim = sc.nextInt();
			
			
			switch(secim) {
			case 1:	System.out.println("Kaç öğrenci tanımlayacaksınız.....: ");
					int miktar = sc.nextInt();
					sc.nextLine();
					for(int i = 0; i<miktar;i++) {
						
						System.out.print(" ad giriniz: ");
						String ad = sc.nextLine();
						
						liste.add(ad);
						
					}
					liste.getList();break;
						
					
		
					
			case 2: liste.hobi();break;
				
			case 3:
				System.out.println("selam");
					liste.maasBilgisi();break;
					
			case 4:
				liste.sinifListesi();break;
					
			}
			
		}while(secim != 0);
	
		
	
	}

	
		
	}

