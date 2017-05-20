class NumericFunctions<A extends Number, B extends Number> {
	A a;
	B b;
	
	NumericFunctions(A x, B y){
		a=x;
		b=y;
	}
	
	double sum(){
		return a.doubleValue() + b.doubleValue();
	}
	
	double difference(){
		return a.doubleValue() - b.doubleValue();
	}
}

public class MultipleParams {
	
	public static void main(String []args){
		
		NumericFunctions<Integer,Integer> nf = new NumericFunctions<>(3,12);
		
		System.out.println("The sum is " + nf.sum());
		System.out.println("The difference is " + nf.difference());
		
	}
}
