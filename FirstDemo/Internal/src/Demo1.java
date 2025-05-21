interface info<T extends Comparable<T>>
{
	T min(T a,T b);
	T max(T a, T b);
}
class General<T extends Comparable<T>> implements info<T>
{

	public T min(T a, T b) {
		// TODO Auto-generated method stub
		if(a.compareTo(b)<0)
		return a;
		else
			return b;
	}

	public T max(T a, T b) {
		if(a.compareTo(b)>0)
			return a;
		else return b;
	
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		General<Integer> s = new General<Integer>();
		General<String> a  = new General<String>();
		System.out.print(s.min(10, 20));
		System.out.print(s.max(10, 20));
		System.out.print(a.max("A", "B"));
	}

}
