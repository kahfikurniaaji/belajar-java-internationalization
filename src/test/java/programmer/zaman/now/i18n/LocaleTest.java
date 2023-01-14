package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testNewLocale() {
        String language = "id";
        String country = "ID";
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
    @Test
    void testNewLocaleUS() {
        String language = "us";
        String country = "US";
        Locale locale = new Locale(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

}

