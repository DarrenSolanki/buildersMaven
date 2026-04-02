package buildersMaven;

public class DemoStaticBlock {

	    static {
	        System.out.println("Static Block");
	    }

	    {
	        System.out.println("Instance Block");
	    }

	    DemoStaticBlock() {
	        System.out.println("Constructor");
	    }
	    
	    public void m1() {
	    	System.out.println("m1");
	    }

	    public static void main(String[] args) {
	       DemoStaticBlock d = new DemoStaticBlock();
	       d.m1();
	        
	        System.out.println("Main method");
	    }
	
}
