package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    @Test
    void testResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIndonesia() {
        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound() {
        Locale usa = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", usa);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleMultipleTimes() {
        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("message", indonesia);
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle1 == resourceBundle2);
    }
}
