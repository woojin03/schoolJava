import java.util.ArrayList;
import java.util.Scanner;

class person{
	String name, tel; 
	public person(String name, String tel)
	{
		this.name=name; 
		this.tel=tel;
	}
	public String tosString() 
	{
		return name+"�� ��ȭ��ȣ: "+tel;
	}
}
public class Ex4 {

	public static void main(String[] args) {
		ArrayList<person> list=new ArrayList<person>();
		Scanner s=new Scanner(System.in);
		for(int i=0; i<3; i++)
		{
			System.out.println("�̸��� ��ȭ��ȣ �Է�");
			String name=s.next();
			String tel=s.next();
			list.add(new person(name,tel));
		}
		for(person p:list)
			System.out.println(p);
	}

}
