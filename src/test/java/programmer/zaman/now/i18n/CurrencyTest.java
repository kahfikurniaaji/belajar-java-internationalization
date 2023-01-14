package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrencyIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        Currency currency = Currency.getInstance(indonesia);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(indonesia));
    }

    @Test
    void testCurrencyUSA() {
        Locale usa = new Locale("en", "US");
        Currency currency = Currency.getInstance(usa);

        System.out.println(currency.getDisplayName());
        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getSymbol(usa));
    }

    @Test
    void testNumberFormatCurrencyIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        String format = numberFormat.format(1000000.33);
        System.out.println(format);
    }

    @Test
    void testNumberFormatCurrencyParseIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            double parse = numberFormat.parse("Rp900.000,25").doubleValue();
            System.out.println(parse);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
