/*
 class Pizza
 -멤버변수 topping 접근제한 생성자로 초기ㅗ하(private)
 -오늘 팔린 피자의 개수를 가져오는 정적 멤버변수 count
 */
class pizza
{
	private String topping;
	int count=0;
	static int cnt=0;
	public pizza(String topping)
	{
		this.topping=topping;
		count++;
		cnt++;
	}
	public String getTopping() {return topping;}
	public int getCount() {return count;}
	public static int getCnt() {return cnt;}
	//
	@Override
	public String toString() {
		return "내가 주문한피자= " + topping + "피자";
	}
}
public class Ex1 {

	public static void main(String[] args) {
		pizza p1= new pizza("포테이토");
		pizza p2= new pizza("치즈");
		pizza p3= new pizza("고구마");
		//객체배열 최기화하고 for~each 문으로 출력
		pizza[] p= {p1,p2,p3};
		for(pizza list: p)
		{
			System.out.println(list);

		}
		System.out.println("고구마 피자가 팔린 개수는: "+p3.count);
		System.out.println("피자가 팔린 개수는: "+pizza.getCnt());
	}

}
