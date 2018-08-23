package pcastro.Calculator;

public class Calculator {
	  public int evaluate(String expression) {
	    String tokens[] = expression.split("(?<=\\+)|(?=\\+)|(?<=\\-)|(?=\\-)");
	    int result = Integer.parseInt(tokens[0]);
	    
	    for(int i = 1; i < tokens.length-1; i+=2) {
	    	switch(tokens[i]) {
	    	case "+":
	    		result += Integer.parseInt(tokens[i+1]);
	    		break;
	    	case "-":
	    		result -= Integer.parseInt(tokens[i+1]);
	    		break;
	    	}
	    }
	    return result;
	  }
}
