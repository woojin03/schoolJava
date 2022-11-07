class Account{
	//계좌번호,이름,입금액 멤버변수(접근제한)
	private int number; 
	private String name; 
	private int saving; 
	/*
	 값을 할당 setter 함수 정의 반환해주는 getter 정의 
	 setter 함수: set필드명 함수를 정의하여 값을 저장
	 */
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSaving() {
		return saving;
	}
	public void setSaving(int saving) {
		this.saving = saving;
	}
	
	
}
public class Ex2 {

	public static void main(String[] args) {
		Account obj1=new Account();
		obj1.setNumber(1111);
		obj1.setName("이우진");
		obj1.setSaving(10000);
		
		System.out.println(obj1.getNumber()+": "+obj1.getName()+"의 입금액은"+obj1.getSaving());	
	}
	

}
