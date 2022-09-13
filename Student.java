package studentInfoSystem;

public class Student {
	String name;
	String no;
	String degree;
	Course c1;
	Course c2;
	Course c3;
	double average;
	boolean isPass;
	
	Student(String name,String no,String degree,Course c1,Course c2,Course c3){
		this.name=name;
		this.no=no;
		this.degree=degree;
		this.average=0;
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		this.isPass=false;
	}
	
	void addBulkExamNote(int n1,int n2,int n3) {
		if(n1>=0 && n1<=100) {
			
			this.c1.note=n1;
			
		}
		if(n2>=0 && n2<=100) {
			this.c2.note=n2;
			
		}
		if(n3>=0 && n3<=100) {
			this.c3.note=n3;
			
		}
	}
	
	void printNoteInfo() {
		System.out.println(this.name+ " adli ogrencinin "+ this.c1.name + " notu: "+this.c1.note);
		System.out.println(this.name+ " adli ogrencinin "+ this.c2.name + " notu: "+this.c2.note);
		System.out.println(this.name+ " adli ogrencinin "+ this.c3.name + " notu: "+this.c3.note);
	}
	
	void isPass() {
		this.average=(this.c1.note+this.c2.note+this.c3.note)/3.0;
		if(this.average>=55) {
			this.isPass=true;
			System.out.println("Gecti!");
		}else{
			this.isPass=false;
			System.out.println("Kaldi!");			
		}
	}
	

}
