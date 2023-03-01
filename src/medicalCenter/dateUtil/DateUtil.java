package medicalCenter.dateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public static SimpleDateFormat sdtf = new SimpleDateFormat("dd-HH-yyyy HH:mm");


    public static boolean isSameDay(Date day1, Date day2) {
        return sdf.format(day1).equals(sdf.format(day2));
    }

    public static String dataToString(Date dateTime) {
        return sdtf.format(dateTime);
    }

    public static Date stringToDate(String strdate) throws ParseException {
        return sdf.parse(strdate);
    }
}
