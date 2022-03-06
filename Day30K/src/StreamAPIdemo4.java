import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		values.forEach(new Consumer<Integer>() {          //Using function.Consumer Printing the ArrayList
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
	}

}
