package lab;
//lab3.
//5
import java.time.*;
import java.util.*;
public class SysDate {
	   public static void main(String[] args)
	    {
	        LocalDate pdate = LocalDate.of(2022,01,07);
	        LocalDate now = LocalDate.now();

	        Period diff = Period.between(pdate, now);

	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }
	}

