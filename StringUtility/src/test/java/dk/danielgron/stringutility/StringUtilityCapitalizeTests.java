package dk.danielgron.stringutility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StringUtilityCapitalizeTests {


    @Test
    void when_capitalize_aBc_should_be_ABC() {
        //Arrange
        var expected = "ABC";

        //Act
        var result = StringUtilityApplication.capitalizeString("aBc");

        //Assert
        assertEquals(expected, result);
    }

}
