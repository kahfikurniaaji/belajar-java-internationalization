package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    @Test
    void testNumberFormat() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        String format = numberFormat.format(1000000.255);

        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indonesia);
        String format = numberFormat.format(1000000.255);

        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(indonesia);

        try {
            double result = numberFormat.parse("10.000,255").doubleValue();
            System.out.println(result);
        } catch (ParseException exception) {
            System.out.println("Error parse : " + exception.getMessage());
        }
    }
}
