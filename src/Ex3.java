/*
 클래스 tv
 1.멤버 변수:channel, volumn boolean turnoff(접근 제한)
 2. 디폴트 생성자 채널 볼륨 turn off=false 초기화
 3. 모든 값이 다 초기화 되는 생성자 정의
 4. 값이 출력해주는 to String()함수 정의
 5. 객체를 생성하여 디폴트 생성자 호출 객체 값을 다 초기화 하는 객체 생성하여 출력
 */
class tv{
	private int channe; 
	private int volumn;
	private boolean turnoff;
	
	public int getChanne() {
		return channe;
	}
	public void setChanne(int channe) {
		this.channe = channe;
	}
	public int getVolumn() {
		return volumn;
	}
	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	public boolean isTurnoff() {
		return turnoff;
	}
	public void setTurnoff(boolean turnoff) {
		this.turnoff = turnoff;
	}
	public tv()
	{
		this(7,15,false);
	}
	public tv(int channel, int volumn, boolean turnoff)
	{
		this.channe=channel;
		this.volumn=volumn;
		this.turnoff=turnoff;
		
	}
	@Override
	public String toString() {
		return "현재tv [channe=" + channe + ", volumn=" + volumn + ", turnoff=" + turnoff + "]";
	} 
	
}
public class Ex3 {

	public static void main(String[] args) {
		tv t1=new tv();
		tv t2=new tv();
		tv[]t= {t1,t2};
		t1.setChanne(22);
		t2.setVolumn(25);
		for(tv list:t)
			System.out.println(list);
}

}
