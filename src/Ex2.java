import java.util.Scanner;

/*
 class car(멤버변수 model(St), color(St), speed(int) (접근제한))
-생성자로 초기화 
to String() 모델, 색, 속도 출력
객체(car)를 3대 만들고 한꺼번에 출력
현재 만들어진 차가 몇대인지 출력=>static
 */
class car{
	private String model; 
	private String color; 
	private int speed; 
	private static int count; 
	public car(String model, String color, int speed){
		this.model=model;
		this.color=color;
		this.speed=speed;
		count++;
	}
	public String getModel() {return model;}
	public String getColor() {return color;}
	public int getSpeed() {return speed;}
	public static int getCount() {return count;}
	@Override
	public String toString() {
		return "car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}
}
public class Ex2 {

	public static void main(String[] args) {
		car c[]= new car[3];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<c.length;i++){
			System.out.print("구입한 차종과 색깔 속도를 순서대로 입력");
			String model=s.next();
			String color=s.next();
			int speed=s.nextInt();
			c[i]=new car(model, color,speed);
		}
		for(car list:c) 
		{
			System.out.println(list);
		}
		System.out.println("현재 만들어진 차량: "+car.getCount()+"대");

	}

}
