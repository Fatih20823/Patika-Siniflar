package com.main;



public class Student {
	String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
     

    }
    
    public void addBulkWordNote(int wordMatNote, int wordFizikNote, int wordKimyaNote) {
    	
    	if (wordMatNote >= 0 && wordMatNote <= 100) {
    		this.mat.wordNote = wordMatNote;
    	}
    	
    	if (wordFizikNote >= 0 && wordFizikNote <= 100) {
    		this.fizik.wordNote = wordFizikNote;
    	}
    	
    	if (wordKimyaNote >= 0 && wordKimyaNote <= 100) {
    		this.kimya.wordNote = wordKimyaNote;
    	}
    } 

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.wordNote == 0 || this.fizik.wordNote == 0 || this.kimya.wordNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
    	
    	this.fizik.note =(fizik.note*0.80 + fizik.wordNote*0.20);
    	this.kimya.note =(kimya.note*0.80 + kimya.wordNote*0.20);
    	this.mat.note =(mat.note*0.80 + mat.wordNote*0.20);
    	
        this.avarage = (int) (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){   	
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "\nÖğrenci Matematik sözlü Notu Ortalamaya Etkisi: " + this.mat.wordNote*0.20);
        System.out.println("Fizik Notu : " + this.fizik.note + "\nÖğrenci Fizik sözlü Notu Ortalamaya Etkisi: " + this.fizik.wordNote*0.20);
        System.out.println("Kimya Notu : " + this.kimya.note + "\nÖğrenci Kimya sözlü Notu Ortalamaya Etkisi: " + this.kimya.wordNote*0.20);
    	
    }
}
