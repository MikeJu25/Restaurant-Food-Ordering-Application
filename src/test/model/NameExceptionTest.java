package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ui.Main;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static ui.Main.*;

public class NameExceptionTest {
    private String operation;
    private String str;

    @Test
    public void testCheckNameLegalTrue() {
        str = new String();
        str = "Jack";
        try {
            assertTrue(checkNameLegal(str));
        } catch (TooLongName tooLongName) {
            fail("The name is legal");
        } catch (RepeatedName repeatedName) {
            fail("this name hasn't been used");
        }
    }

    @Test
    public void testCheckNameLegalTooLong() {
        operation = new String();
        operation = "sdfasfdsafdsf";
        try {
            assertTrue(checkNameLegal(operation));
        } catch (TooLongName tooLongName) {
            //expected;
        } catch (RepeatedName repeatedName) {
            fail("this name hasn't been used");
        }
    }

    @Test
    public void testCheckNameLegalUsed() {
        operation = new String();
        operation = "sd";
        str = "sd";
        names.add(operation);
        try {
            assertTrue(checkNameLegal(str));
        } catch (TooLongName tooLongName) {
            fail("The name is legal");
        } catch (RepeatedName repeatedName) {
            //expected
        }
    }
}
