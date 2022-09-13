package studentInfoSystem;

public class Course {
	Teacher teacher;
	String name;
	String prefix;
	String code;
	int note;
	
	Course(String name,String prefix,String code){
		this.name=name;
		this.prefix=prefix;
		this.code=code;
		int note=0;
	}
	
	void addTeacher(Teacher t) {
		if(t.branch.equals(this.prefix)) {
			this.teacher=t;
		}else {
			System.out.println("Ogretmen ve ders uyusmuyor!");
		}
	}
	
	void printTeacherInfo() {
		this.teacher.print();
	}


		
		
	

}
