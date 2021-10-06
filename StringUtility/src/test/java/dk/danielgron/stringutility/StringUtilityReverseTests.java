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

    @Test
    void when_reverse_empty_should_be_empty() {
        //Arrange
        var expected = "";

        //Act
        var result = StringUtilityApplication.reverseString("");

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void when_reverse_a_should_be_a() {
        //Arrange
        var expected = "a";

        //Act
        var result = StringUtilityApplication.reverseString("a");

        //Assert
        assertEquals(expected, result);
    }

}
