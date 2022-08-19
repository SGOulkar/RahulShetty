package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date a = new Date();
		System.out.println(a.toString());
		
		SimpleDateFormat sdf =new SimpleDateFormat("d/M/y h:m:s");
		System.out.println(sdf.format(a));
	}

}
