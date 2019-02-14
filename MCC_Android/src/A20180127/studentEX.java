package A20180127;

class student{
	int id;
	String name;
	student(){
		id=-1;
		name="UNKNOWN";
	}
	student(int id ,String name){
		this.id=id;
		this.name=name;
	}
	int getId(){
		return id;
	}
	String getName() {
		return name; 
	}
	void display() {
		System.out.println(getId()+" "+getName());
	}
}

public class studentEX {

	public static void main(String[] args) {
		student s1= new student(1,"BIG");
		s1.display();
		student s2= new student(2,"LE");
		s2.display();
		student s3 = new student();
		s3.display();
	}

}
