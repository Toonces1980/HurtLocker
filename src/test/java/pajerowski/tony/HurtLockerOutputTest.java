package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HurtLockerControllerTest {
    HurtLockerController output;

        @Before
        public void setup() {
            output = new HurtLockerController();
        }

        @Test
        public void makeDoubleLineTest() {
            String expected = "=============             =============";
            String actual = output.makeDoubleLines();
            assertEquals(expected,actual);
        }

        @Test
        public void makeSingleLineTest() {
            String expected = "-------------             -------------";
            String actual = output.makeSingleLines();
            assertEquals(expected,actual);
        }

        @Test
        public void makeNameFormatTest() {
            String expected =   "name:   Milk              seen: 1 times\n" +
                    "=============             =============";
            String actual = output.makeNameFormat("Milk");
            assertEquals(expected,actual);
        }

        @Test
        public void printOutputTest() {
            String expected =  "name:    Milk\t\t seen: 6 times\n" +
                    "=============\t \t =============\n" +
                    "Price: \t 3.23\t\t seen: 5 times\n" +
                    "-------------\t\t -------------\n" +
                    "Price:   1.23\t\t seen: 1 time\n" +
                    "\n" +
                    "name:   Bread\t\t seen: 6 times\n" +
                    "=============\t\t =============\n" +
                    "Price:   1.23\t\t seen: 6 times\n" +
                    "-------------\t\t -------------\n" +
                    "\n" +
                    "name: Cookies     \t seen: 8 times\n" +
                    "=============     \t =============\n" +
                    "Price:   2.25        seen: 8 times\n" +
                    "-------------        -------------\n" +
                    "\n" +
                    "name:  Apples     \t seen: 4 times\n" +
                    "=============     \t =============\n" +
                    "Price:   0.25     \t seen: 2 times\n" +
                    "-------------     \t -------------\n" +
                    "Price:   0.23  \t \t seen: 2 times\n" +
                    "\n" +
                    "Errors         \t \t seen: 4 times";
            String actual = null;
            assertEquals(expected,actual);
        }

    }
