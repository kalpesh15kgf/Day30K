interface Sayable{  
    void say();  
}  
public class MethodRefrenceUsingStaic {
	  public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Referring static method  
        Sayable sayable = MethodRefrenceUsingStaic::saySomething;  
        // Calling interface method  
        sayable.say();  
	}

}
