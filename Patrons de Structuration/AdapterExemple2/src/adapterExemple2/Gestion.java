package adapterExemple2;

public class Gestion {

	public static void main(String[] args) {
		
		Object res2; 
		Object res3;
		
		Stack stack;
		stack = new DListImpStack();
		
	    stack.push(2);
		
		res2 = stack.pop();
		System.out.println(res2);
		
		res3 = stack.top();
		System.out.println(res3);
		
	}
	
}
