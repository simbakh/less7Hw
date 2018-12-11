package less7HW;

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 10; i++) {
			String text = String.format("%." + i + "f", Math.PI);
			System.out.println(text);
		}
	}

}
