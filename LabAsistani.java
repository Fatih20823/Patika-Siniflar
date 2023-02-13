package com.main;

public class LabAsistani extends Asistan {

	public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
		super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);	
	}

	public void lablaraGir() {
		System.out.println(this.getAdSoyad() + " Laboratuvar'a girdi !!");
	}
	
	public void derseGir() {
		System.out.println(this.getAdSoyad() + " Derse girdi !!");
	}
}
