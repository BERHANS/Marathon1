package com.berhan;

import java.util.Scanner;

public class ogrenciOzelListe {

	String[] ogrenciOzelListe;
	int kapasite = 0;
	
	Double[] maasOzelListe;
	boolean[][] hobiler;
	public void add (String ad) {
	
		String[] liste1;
		if(ogrenciOzelListe == null) {
		ogrenciOzelListe = new String[1];
		ogrenciOzelListe[0] = ad;
		}else {
		liste1  = new String[kapasite+1];
		
		for(int i = 0; i<kapasite ; i++)
			liste1[i] = ogrenciOzelListe[i];
			liste1[kapasite] = ad;
			ogrenciOzelListe = liste1;
		}
	 
		kapasite++;
	} 

	public void hobi() {
		boolean[][] hobiler = new boolean [kapasite][4];
		Scanner sc = new Scanner (System.in);
		
		for(int i =0 ; i<kapasite;i++) {
			
			System.out.println(ogrenciOzelListe[i] + " yürümekten hoşlanır mısınız? ");
			hobiler[i][0] = sc.nextBoolean();
			System.out.println(ogrenciOzelListe[i] +" Kitap okumaktan hoşlanır mısın? ");
			hobiler[i][1] = sc.nextBoolean();
			System.out.println(ogrenciOzelListe[i] + " Spor rutinlerin var mı? ");
			hobiler[i][2] = sc.nextBoolean();
			System.out.println(ogrenciOzelListe[i] +" Kod yazmaktan hoşlanır mısın?  ");
			hobiler[i][3] = sc.nextBoolean();
			
		}
		
	}
	
	public void maasBilgisi() {
		Scanner sc = new Scanner(System.in);
		maasOzelListe = new Double[kapasite]; 
		for(int i =0;i<kapasite;i++) {
	System.out.println(ogrenciOzelListe[i] + " maaş beklentiniz ne kadar ");
		double maas = sc.nextDouble();
		maasOzelListe[i] = maas;
		
		}
		for(int j =0 ;j<kapasite;j++)
			System.out.println(ogrenciOzelListe[j] + "'nin maaş beklentisi " + maasOzelListe[j]);
		
	}
	 public void getList() {
		 for(int i = 0 ;i<kapasite;i++)
			 System.out.println((i+1) +" .öğrencinin adı " + ogrenciOzelListe[i]);
	 }

	public void sinifListesi() {
		System.out.println("NO | AD | HOBİLER | MAAŞ BEKLENTİSİ");
		for(int i = 0; i<kapasite;i++) {
		
			System.out.println((i+1) + "\s" + ogrenciOzelListe[i] +"\t"+ maasOzelListe[i]+ "\t");
			}
	}
	
}
