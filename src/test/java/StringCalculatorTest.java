import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {
    StringCalculator stringCalculator;
    @Before
    public void init(){
        stringCalculator = new StringCalculator();
    }

 @Test
    public void getZeroForEmptyString(){
        Assert.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void sumOfOneInteger(){
        Assert.assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void sumOfTwoInteger(){
        Assert.assertEquals(3, stringCalculator.add("1,2"));
    }

@Test
    public void addNumbersWithNewLine(){
        Assert.assertEquals(6, stringCalculator.add("1\n2,3"));
    }

@Test
    public void supportDifferentDelimiter() {
        Assert.assertEquals(4, stringCalculator.add("//;\n1;3"));
    }


@Test
    public void negativeNumberShouldThrowException() {
        try {
            stringCalculator.add("//;\n-1;3");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Negatives not allowed", e.getMessage());
        }
    }


@Test
    public void multipleNegativeNumberShouldThrowException() {
        try {
            stringCalculator.add("//;\n-1;3,-2");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Negatives not allowed -1,-2", e.getMessage());
        }
    }

@Test
    public void getAddCalledCount() {
        stringCalculator.add("//;\n1;3");
        Assert.assertEquals(1, stringCalculator.getCalledCount());
    }



}	}
}