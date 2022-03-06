import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a list of strings
        List<String> names = Arrays.asList(
            "Kalpesh", "KalpeshJadhav", "k1", "JK", "Kalpesh2");
  
        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String> p = (s) -> s.startsWith("K");
  
        // Iterate through the list
        for (String st : names) {
            // call the test method
            if (p.test(st))
                System.out.println(st);
        }
	}

}
