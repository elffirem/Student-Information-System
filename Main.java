package studentInfoSystem;

public class Main {
	public static void main(String[] args) {
		Teacher t1=new Teacher("Adem Hoca","0505","MTH");
		Teacher t2=new Teacher("Uğur Hoca","0543","BYO");
		Teacher t3=new Teacher("Ali Hoca","0531","FZK");
		Course matematik=new Course("Matemaik","MTH","000");
		Course biyoloji=new Course("Biyoloji","BYO","111");
		Course fizik=new Course("Fizik","FZK","222");
		matematik.addTeacher(t1);
		biyoloji.addTeacher(t2);
		fizik.addTeacher(t3);
		Student elif= new Student("Elif","56","3",matematik,biyoloji,fizik);
		elif.addBulkExamNote(100, 80, 50);
		elif.printNoteInfo();
		elif.isPass();
	}
}
