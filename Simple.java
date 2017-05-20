/**
 * Explains the simple use of Generics
 * Generics work only with Reference/Object types
 *
 */

/**
 * 
 * @author Catalin Mazilu
 *
 * @param <T> generic type
 */
class Gen<T>{
	T ob;
	
	Gen(T o){
		ob = o;
	}

	//returns the generic object
	T getObj(){
		return ob;
	}
	
	void showType(){
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}


public class Simple {
	
	public static void main(String []args){
		Gen<Integer> myOb;
		
		myOb = new <Integer>Gen(101);
		
		myOb.showType();
		
		int c = myOb.getObj();
		
		
	}
}
