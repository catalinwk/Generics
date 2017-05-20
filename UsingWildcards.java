/**
 * Wildcard ? is used as a parameter when using generic types  
 * 
 */
class NumericFns<T extends Number> {
	T ob;
	
	NumericFns(T a){
		ob = a;
	}
	
	NumericFns(){
		
	}
	
	//checks if the numbers are equal as absolute values
	boolean absEquals(NumericFns<?> x){
	
		if (ob.doubleValue()==x.ob.doubleValue())
			return true;
		
		return false;
	}
	
}


public class UsingWildcards {

	public static void main(String []args){
		NumericFns<Integer> a = new NumericFns<Integer>(10);
		
		NumericFns<Double> b  = new NumericFns<Double>((double) 13);
		
		System.out.println("The number are abs equal: " + a.absEquals(b));
	}
}
