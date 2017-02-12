package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HurtLockerModelTest {
    HurtLockerModel model;

    @Before
    public void setup() throws MissingDataException {
        model = new HurtLockerModel("apples" , "3.23", "Food", "11/11/2016");
    }

    @Test
    public void hurtLockerModelSuccessTest() throws MissingDataException {
        String expected = model.name;
        String actual = new HurtLockerModel("apples", "3.23", "Food", "11/11/2016").name;
        assertEquals(expected,actual);
    }
}
