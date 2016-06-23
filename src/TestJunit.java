import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    // Failed test
    public void testPrintMessageFailure() {
        assertEquals("New World", messageUtil.printMessage());
    }
}