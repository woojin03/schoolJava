class Hero
{
	String name;
	int power;
	int speed;
	public Hero() {
		this("����",10,10);
	}
	public Hero(String name, int power, int speed)
	{
		this.name=name;
		this.power=power;
		this.speed=speed;
	}
	public Hero(String name, int power)
	{
		this();
		this.name=name;
		this.power=power;
	}
	public String toString()
	{
		return "Hero [�̸�= "+name+" ,����="+power+" ,�ӵ���="+speed+"]";
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Hero h1=new Hero("���̾��",200,300);
		Hero h2=new Hero("��ũ",100,200);
		Hero h3=new Hero("�����̴���",300);
		Hero h4=new Hero();
		Hero[] h= {h1,h2,h3,h4};
		for(int i=0; i<4; i++)
			System.out.println(h[i]);
		
		
	}

}
