package programmer.zaman.now.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTypeTest {
    @Test
    void testMessageFormatType() {
        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, indonesia);
        String format = messageFormat.format(new Object[]{
                "Kahfi", new Date(), 1000000
        });

        System.out.println(format);
    }

    @Test
    void testMessageFormatTypeUS() {
        Locale indonesia = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, indonesia);
        String format = messageFormat.format(new Object[]{
                "Kahfi", new Date(), 1000000
        });

        System.out.println(format);
    }
}
