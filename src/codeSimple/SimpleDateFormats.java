package codeSimple;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormats {

	public static void main(String[] args) {
		
	
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new java.util.Date());
		System.out.println(date); // 06-23-2020


	
	
}
}