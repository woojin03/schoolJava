/*
 (시험 출제)
 은행 게좌 jbank생성
 name money rate(이율) 멤버변수 접근제한
 */
class jbank{
	private String name;
	private double money; 
	private static double rate; //변동금리, double rate= 고정금리
	public jbank(String name, double money, double rate) {
		this.name=name;
		this.money=money;
		this.rate=rate;
	}
	@Override
	public String toString() {
		return "jbak [name=" + name + ", money=" + money + ", rate=" + rate + "]";
	}
}
public class Ex3 {

	public static void main(String[] args) {
		jbank j1=new jbank("a", 1000.0,0.01);
		System.out.println(j1);//0.01
		System.out.println("-------------------------------------");
		jbank j2=new jbank("b", 2000.0,0.03);
		System.out.println(j1);//0.01
		System.out.println(j2);//0.03
		System.out.println("-------------------------------------");
		jbank j3=new jbank("b", 2000.0,0.05);
		System.out.println(j1);//0.01
		System.out.println(j2);//0.03
		System.out.println(j3);//0.05

	}

}
