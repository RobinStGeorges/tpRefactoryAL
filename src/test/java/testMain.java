import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testMain {
    @Test
    public void firstTest() throws Exception {
        Person person = new Person("01","22334455");
        assertEquals("0122334455", person.getTelNum());

    }
}
