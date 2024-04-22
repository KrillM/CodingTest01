package Bronze5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q31_10699{
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(simpleDateFormat.format(date));
    }
}
