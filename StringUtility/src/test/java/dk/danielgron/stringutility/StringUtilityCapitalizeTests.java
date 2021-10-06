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

    @Test
    void when_capitalize_empty_should_be_empty() {
        //Arrange
        var expected = "";

        //Act
        var result = StringUtilityApplication.capitalizeString("");

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void when_capitalize_ABC_should_be_ABC() {
        //Arrange
        var expected = "ABC";

        //Act
        var result = StringUtilityApplication.capitalizeString("ABC");

        //Assert
        assertEquals(expected, result);
    }

    @Test
    void when_capitalize_def_should_be_DEF() {
        //Arrange
        var expected = "DEF";

        //Act
        var result = StringUtilityApplication.capitalizeString("def");

        //Assert
        assertEquals(expected, result);
    }

}
