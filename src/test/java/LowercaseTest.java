import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowercaseTest {

    @Test
        //  @DisplayName("Test")
    void toLowerCase() {

        //     Main mains = new Main();

        Lowercase lowercase = new Lowercase();

        String str = "SECONDASSIGNMENT";
        String res = str.toLowerCase();
        assertEquals("secondassignment", lowercase.runtest(res));
        assertNotNull(res);
        System.out.println(res);

    }


}

