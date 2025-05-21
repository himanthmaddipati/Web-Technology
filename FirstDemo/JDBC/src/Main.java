interface GenInterface<T>{
	T min(T a, T b);
	T max(T a, T b);
}
class GenericDemo<T extends Comparable<T>> implements GenInterface<T> {
@Override
public T min(T a, T b) {
	if(a.compareTo(b)<0)
		return a;
		else
		return b;
	}
@Override
public T max(T a, T b) {
	if(a.compareTo(b)>0)
		return a;
		else
		return b;
	}
}
public class Main {
public static void main(String[] args) {
	GenericDemo<Integer> obj = new GenericDemo< Integer >();
	System.out.println("Minimum value :"+obj.min(10,20));
	System.out.println("Maximum value :"+obj.max(10,20));
	
	GenericDemo<String> obj2 = new GenericDemo< String >();
	System.out.println("Minimum value:"+obj2.min("Mango","Apple"));
	System.out.println("Maximum value :"+obj2.max("Mango","Apple"));
	}
}