class man
{
	private String name;
	private String dept;
	public man(String name, String dept)
	{
		this.name=name;
		this.dept=dept;
	}
	public void show()
	{
		System.out.print(name+":"+dept);
	}
}
class proffesor extends man
{
	private String position; 
	public proffesor(String name, String dept, String position) 
	{
		super(name,dept);
		this.position=position; 
	}
	public void show()
	{
		super.show();
		System.out.println(", 직위: "+position);
	}
}
class student extends man
{
	private int grade;
	public student(String name, String dept, int grade)
	{
		super(name,dept);
		this.grade=grade;
	}
	public void show()
	{
		super.show();
		System.out.println(", 학년"+":"+grade);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		student s1= new student("이우진", "소프트웨어학과", 1);
		s1.show();
		proffesor p1=new proffesor("김철수", "컴공", "조교수");
		p1.show();
		student s2= new student("이영희", "멀티", 1);
		student s3= new student("공인숙", "겜콘", 1);


	}

}
