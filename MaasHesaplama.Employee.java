package com.main;

public class Employee {

	public String name;
	public double salary;
	public int workHours;
	public int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
	}
	
	public double tax() {
		if (this.salary<1000) {
			return 0;
		}else {	
			return (this.salary*0.03);		 
		}
		
	}
	
	public double bonus() {
		if (this.workHours>40) {
			return (this.workHours-40)*30;
		}else {
			return 0;
		}		
	}
	
	public double raiseSalary() {
		hireYear=2021-this.hireYear;
		if(hireYear<10) {
			return this.salary*0.05;
			
		}else if (hireYear>9 && hireYear<20) {
			return this.salary*0.10;
			
		}else {
			return this.salary*0.15;
			
		}
	}

	public String toString() {
		
	 String info = "Adı: " + this.name +'\n'
	           +"Maaş: " + this.salary +'\n'
	           +"Çalışma Saati: " + this.workHours +'\n'
	           +"Başlangıç Yılı: " + this.hireYear +'\n'
	           +"Vergi: " + tax()  +'\n'
	           +"Bonus: " + bonus() +'\n'
	           +"Maaş Artışı: " + raiseSalary() +'\n'
	           +"Vergi ve Bonuslar ile birlikte maaş: "
	           + (this.salary-tax()+bonus()) +'\n'
	           +"Toplam Maaş: " + (this.salary+raiseSalary()) +'\n';
	 return info;

	}		
	
}
