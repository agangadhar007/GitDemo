package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar Cal = Calendar.getInstance();
SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
System.out.println(sd.format(Cal.getTime()));
System.out.println(Cal.get(Calendar.DAY_OF_MONTH));
System.out.println(Cal.get(Calendar.MINUTE));
System.out.println(Cal.get(Calendar.AM_PM));
System.out.println(Cal.get(Calendar.DAY_OF_WEEK));


	}

}
