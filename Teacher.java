package studentInfoSystem;

public class Teacher {
	String name;
	String mpno;
	String branch;
	
	Teacher(String name,String mpno,String branch){
		this.name=name;
		this.mpno=mpno;			
		this.branch=branch;
	}
	
	void print() {
		System.out.println(name);
		System.out.println(mpno);
		System.out.println(branch);
	}

}
