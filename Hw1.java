package less7HW;


import java.util.Calendar;
import java.util.Date;

public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		Calendar cl = Calendar.getInstance();
		cl.set(2018, 10, 11);
		Date date1 = cl.getTime();
		System.out.println(date1);
		long a = date.getTime();
		long b = date1.getTime();
		long c = a-b;
		System.out.println(c);
			}

}
