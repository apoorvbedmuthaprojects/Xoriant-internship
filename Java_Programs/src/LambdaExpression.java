
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoInterface ref;
	    
	    // lambda expression
	    ref = (str) -> {
	    	String result = "";
	    	for (int i = str.length()-1; i >= 0 ; i--)
	    	result += str.charAt(i);
	    	return result;
	    };
	    
    System.out.println("Lambda reversed = " + ref.reverse("Lambda Expression"));
	    

	}

}
