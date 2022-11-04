class Hero
{
	String name;
	int power;
	int speed;
	public Hero() {
		this("미정",10,10);
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
		return "Hero [이름= "+name+" ,힘은="+power+" ,속도는="+speed+"]";
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Hero h1=new Hero("아이언맨",200,300);
		Hero h2=new Hero("헐크",100,200);
		Hero h3=new Hero("스파이더맨",300);
		Hero h4=new Hero();
		Hero[] h= {h1,h2,h3,h4};
		for(int i=0; i<4; i++)
			System.out.println(h[i]);
		
		
	}

}
