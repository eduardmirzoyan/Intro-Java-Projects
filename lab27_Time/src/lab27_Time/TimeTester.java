package lab27_Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTester {
	static DateFormat df = new SimpleDateFormat("HH:mm");
	
	
	public static void main(String[] args) {
		testChoice();
	}
	
	public static void testChoice() {
		Time t1 = new Time();
		Time t2 = new Time(13,5);
		Time t3 = new Time(24,0);
		Time t4 = new Time(1,30);
		Time t5 = new Time(8,30);
		Time t6 = new Time(22,45);
		Time t7 = new Time(0, 9);
		Time t8 = new Time(8, 30, true);
		Time t9 = new Time(0, 1440);
		Time t10 = new Time(0, 1440);
		Time t11 = new Time(520);
		Time t12 = new Time(-1, -30);
		Time t13 = new Time(1, 30, true);
		
//		System.out.println(t1);
//		System.out.println(t2);
//		System.out.println(t3);
//		System.out.println(t4);
//		
//		System.out.println(t5.toMins()+ " minutes");
//		System.out.println(t1.compareTo(t2));
//		System.out.println(t5.elapsedSince(t6)+ " minutes have elapsed");
//		System.out.println(t5.elapsedSince(t1) + " minutes have elapsed");
//		System.out.println(t7.increment());
//		System.out.println(t9);
//		System.out.println(t9.add(t10));
//		System.out.println(t6.subtract(t5));
//		System.out.println(t12);
		t2.setPrintAMPM(true);
		System.out.println(t2);
	}
}
