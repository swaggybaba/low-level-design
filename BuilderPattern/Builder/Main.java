package Builder;
/*
 * Pros:
 * Good way to handle complexity
 * Easy to implement
 * Can be refactored into
 * 
 * Cons:
 * Uses inner static class
 * Sometimes number of lines of code can be huge
 * Have to think of end to end chain
 * 
 * make members final if you want them to be immutable or if they are constants
 * 
 */

import Builder.URLBuilder.Builder;

public class Main {
	
	public static void main(String[] args) {
		Builder builder=new Builder();
		builder.protocol("https").hostName("google.com").pathParam("employeedb").queryParam("2");
		URLBuilder urlBuilder=builder.build();
		System.out.println(urlBuilder.toString());
		
	}
	
}
