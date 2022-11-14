class point{
	private int x=10, y=10;
	public point(int x, int y)
	{
		this.x=x; 
		this.y=y;
	}
	public void showpoint()
	{
		System.out.println(x+","+y);
	}
}
//부모클래스가 생성자로 초기화 되어있으면 자식클래스도 반드시 생성자로 초기화.
class colorpoint extends point
//상속의 개념 상속받은 부모클래스 모든 멤버변수 메서드를 사용할수있다. 
{
	String color="red";
	public colorpoint(int x,int y, String color)
	{
		super(x,y);//부모클래스의 생성자 호출
		this.color=color;
	}
	public void showcolor()
	{
		System.out.println(color); 
		showpoint();
	}
}
public class Ex2 {

	public static void main(String[] args) {
		point p=new point(1,1); 
		p.showpoint();
		colorpoint cp=new colorpoint(50, 50, "blue");
		cp.showcolor();
	}

}
