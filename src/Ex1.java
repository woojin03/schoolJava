/*
 (복습)
 -public
 -private
 -protected=>extends 상속 부모 클래스(상위클래스) 자식 클래스(하위클래스)
 -defalut
 -static : 정적멤버변수, 클래스변수, 클래스메스드, 
 */
class Plane{
	private String product; 
	private String model; 
	private  int customer; 
	private static int count=0;
	 public static int getCount() {return count;}//static 멤버변수 반화메서드 반드시 static
	public Plane()
	{
		this("airbusan", "a12010", 100);
	}
	public Plane(String product, String model, int customer)
	{
		this.product=product;
		this.model=model;
		this.customer=customer;
		count++;
	}
	public String getProduct() {
		return product;
	}
	public String getModel() {
		return model;
	}
	public int getCustomer() {
		return customer;
	}
	
	@Override
	public String toString() {
		return "비행기 [제조사=" + product + ", 모델=" + model + ", 승객수=" + customer + "]";
	}
	
	
}
public class Ex1 {

	public static void main(String[] args) {
		Plane p1=new Plane(); 
		Plane p2=new Plane("asiana","as12012",300); 
		Plane p3=new Plane("korea","k1234",500); 
		System.out.println("운행되는 비행기 수: "+Plane.getCount());
		
		Plane[] p= {p1,p2,p3};
		for(Plane list:p)
		{
			System.out.println(list);
		}
	}

}
