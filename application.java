package com.main;

public class application {

	public static void main(String[] args) {
		 Calisan c1 = new Calisan("Fergin", "056789654","info@hotmail.com");
		 
		 Akademisyen a1 = new Akademisyen("erginF", "0564773663", "info@gmail.com", "harita", "tekniker");
		 Calisan m1 = new Memur("ali veli", "054673784", "ali@hotmail.com", "Bilgi islem", "09:00,18:00");
		 // m1.calis(); uretebilirsin fakat erisemessin
		 OgretimGorevlisi o1 = new OgretimGorevlisi("mahmut cetindag", "056563442", "cet@hotmail.com", "ceng", "Doc", "110");
		 o1.cikis();
		 Asistan as1 = new Asistan("Veli ali", "0657752", "Vel@hotm.com", "elektrik", "Yar.As", "12:00-14:00");
		 System.out.println(as1.getAdSoyad());
	}

}
