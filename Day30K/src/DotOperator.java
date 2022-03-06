
public class DotOperator {
	void show() {
        int i = 67;
        System.out.println("In show method: "+ i);
    }

    static boolean isGreater(int a, int b) {
        return a > b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DotOperator doe = new DotOperator();
        doe.show();
        System.out.println("Is 5>4: " + DotOperator.isGreater(5, 4));
	}

}
