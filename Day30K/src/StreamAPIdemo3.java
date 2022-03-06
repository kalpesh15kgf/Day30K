import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamAPIdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Iterator<Integer> ivalues = values.iterator();   //Using Iterator print The ArrayList
		 while(ivalues.hasNext()) {
			 System.out.println(ivalues.next());
		 }
	}

}
