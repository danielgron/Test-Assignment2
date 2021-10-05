package dk.danielgron.stringutility;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringUtilityLowercaseTests {

    @Test
    void when_lowercase_aBc_should_be_abc() {
        //Arrange
        var expected = "abc";

        //Act
        var result = StringUtilityApplication.lowercaseString("aBc");

        //Assert
        assertEquals(expected, result);
    }

}
