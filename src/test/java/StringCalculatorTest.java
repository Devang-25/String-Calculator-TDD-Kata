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

}	}
}