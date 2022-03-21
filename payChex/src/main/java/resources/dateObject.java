package resources;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//import org.openqa.selenium.WebDriver;

public class dateObject {
	
	private String data;
	private Date date;
	private Calendar cal = Calendar.getInstance();

	
	public dateObject() {		
		this.date=null;
	}	
	
	public int getCurrentMonth() {
		Calendar calendar = new GregorianCalendar();
		return calendar.get(Calendar.MONTH);
	}
	
	public Date getCurrentDate() {		
		return cal.getTime();	

	}	

	// format: "MMMMM dd,yyyy"; MM/dd/yyyy
	public String convertDateTostring(Date date, String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		data = dateFormat.format(date);
		return data;
	}
	
	 public Date convertStringTodate(String strdate, String format) throws ParseException {
		 DateFormat dateFormat = new SimpleDateFormat(format);
		 date = dateFormat.parse(strdate);
		 return date;
	 }
	 
 /*dateObject ob = new dateObject();
	System.out.println(ob.getCurrentMonth()+1);
	System.out.println(ob.getCurrentDate());
	System.out.println(ob.convertDateTostring(ob.getCurrentDate(), "MMMMM dd,yyyy"));
	System.out.println(ob.convertDateTostring(ob.getCurrentDate(), "MM/dd/yyyy"));
	System.out.println(ob.convertDateTostring(ob.getCurrentDate(), "EEEEE MMMMM dd,yyyy"));
	System.out.println(ob.convertStringTodate("April 1,2021", "MMMMM dd,yyyy"));
*/
}
