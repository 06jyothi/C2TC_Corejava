package projectjunit5;
import java.time.LocalDate;
public class localdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate  currData=LocalDate.now();
System.out.println("Current Data is:"+currData);
LocalDate date= LocalDate.parse("2021-08-13");
System.out.println("current date is"+date);

LocalDate date1=LocalDate.of(1975,8,9);
System.out.println("current date is"+date1);

	}

}
