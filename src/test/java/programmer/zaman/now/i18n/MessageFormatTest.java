package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        String pattern = "Hi {0}, Anda bisa mencari data Anda dengan mengetikkan \"{0}\" di pencarian.";
        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{
                "Kahfi"
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatResourceBundle() {
        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{
                "Kahfi", "Programmer Zaman Now"
        });

        System.out.println(format);
    }
}
