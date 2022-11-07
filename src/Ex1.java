class MathEx{
	int square(int i) {return i*i;}
	double square(double i) {return i*i;}
}
public class Ex1 {

	public static void main(String[] args) {
		MathEx obj1=new MathEx();
		System.out.println(obj1.square(10));
		System.out.println(obj1.square(3.5));

	}

}
