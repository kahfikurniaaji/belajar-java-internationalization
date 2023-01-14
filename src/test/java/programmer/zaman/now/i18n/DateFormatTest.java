package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        String pattern = "EEEE dd MMMM yyyy";
        DateFormat dateFormat = new SimpleDateFormat(pattern);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("id", "ID");
        DateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatJapan() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale japan = new Locale("ja", "JP");
        DateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        String format = dateFormat.format(new Date());
        System.out.println(format);
    }

    @Test
    void testDateFormatParseIndonesia() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("id", "ID");
        DateFormat dateFormat = new SimpleDateFormat(pattern, indonesia);

        try {
            Date date = dateFormat.parse("Selasa 03 Januari 2023");
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }
    }

    @Test
    void testDateFormatParseJapan() {
        String pattern = "EEEE dd MMMM yyyy";
        Locale japan = new Locale("ja", "JP");
        DateFormat dateFormat = new SimpleDateFormat(pattern, japan);

        try {
            Date date = dateFormat.parse("火曜日 03 1月 2023");
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }
    }
}
