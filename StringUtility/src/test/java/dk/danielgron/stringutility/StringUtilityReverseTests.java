package dk.danielgron.stringutility;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringUtilityReverseTests {

    @Test
    void when_reverse_aBc_should_be_cBa() {
        //Arrange
        var expected = "cBa";

        //Act
        var result = StringUtilityApplication.reverseString("aBc");

        //Assert
        assertEquals(expected, result);
    }

}
