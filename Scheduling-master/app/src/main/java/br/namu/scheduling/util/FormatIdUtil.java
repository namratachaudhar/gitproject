package br.alexandrenavarro.scheduling.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatIdUtil {

    public static String geIdWithFormattedDateWithoutHours(Calendar calendar, String... ids){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        final String dateFormatted = dateFormat.format(calendar.getTime());

        String result = "";

        for(String id : ids){
            if(result.length() > 0){
                result += "_";
            }

            result += id;
        }

        return result + "_" + dateFormatted;
    }
}
