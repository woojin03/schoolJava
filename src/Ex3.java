import java.util.Scanner;

class movie{
	String title;
	String dt;
	public movie(String title, String dt)
	{
		this.title=title;
		this.dt=dt;
	}
	public String toString()
	{
		return "��ȭ�̸�: "+title+" ,��ȭ����: "+dt;
	}
}
public class Ex3 {

	public static void main(String[] args) {
		movie[]m=new movie[3];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<m.length; i++)
		{
			System.out.println("��ȭ����� ��ȭ���� �Է�");
			String title=s.next();
			String dt=s.next();
			m[i]=new movie(title,dt);
		}
		for(movie obj:m)
			System.out.println(obj);
	}

}
