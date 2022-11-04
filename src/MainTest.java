import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.InputStream;


public class MainTest {
    @Test
    public void sumTest_1() {
        String input = "VIII  + VI    ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "XIV");
    }

    @Test
    public void sumTest_2() {
        String input = "  VI +   IV   ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "X");
    }
    @Test
    public void sumTest_3() {
        String input = "  5 +   7   ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "12");
    }
    @Test
    public void sumTest_4() {
        String input = "9+1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "10");
    }

    @Test
    public void differenceTest_1() {
        String input = "  VI -   IV   ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "II");
    }

    @Test
    public void differenceTest_2() {
        String input = "X-I";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "IX");
    }
    @Test
    public void differenceTest_3() {
        String input = "  10  - 5    ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "5");
    }

    @Test
    public void differenceTest_4() {
        String input = "1-10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "-9");
    }
    @Test
    public void multiplicationTest_1() {
        String input = "1*10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "10");
    }
    @Test
    public void multiplicationTest_2() {
        String input = "  5* 5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "25");
    }
    @Test
    public void multiplicationTest_3() {
        String input = "VII *  VI";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "XLII");
    }
    @Test
    public void multiplicationTest_4() {
        String input = "X*X";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "C");
    }
    @Test
    public void divisionTest_1() {
        String input = "X/ X";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "I");
    }
    @Test
    public void divisionTest_2() {
        String input = "IX / II";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "IV");
    }
    @Test
    public void divisionTest_3() {
        String input = "9 / 4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "2");
    }
    @Test
    public void divisionTest_4() {
        String input = "1 / 3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertEquals(Main.calc(Main.userInput()), "0");
    }

    @Test
    public void InputFormatExceptionTest_1 ()  {
        try {
            Main.calc("I**I");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void inputFormatExceptionTest_2()  {
        try {
            Main.calc("");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void inputFormatExceptionTest_3 ()  {
        try {
            Main.calc("I+8");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void inputFormatExceptionTest_4 ()  {
        try {
            Main.calc("11+99");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void inputFormatExceptionTest_5 ()  {
        try {
            Main.calc("1+9+1");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void inputFormatExceptionTest_6 ()  {
        try {
            Main.calc("XI+I");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void inputFormatExceptionTest_7 ()  {
        try {
            Main.calc("0+1");
            Assert.fail();
        } catch (InputFormatException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void negativeRomanNumberExceptionTest_1 ()  {
        try {
            Main.calc("I-I");
            Assert.fail();
        } catch (NegativeRomanNumberException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void negativeRomanNumberExceptionTest_2 ()  {
        try {
            Main.calc("V/X");
            Assert.fail();
        } catch (NegativeRomanNumberException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
    @Test
    public void negativeRomanNumberExceptionTest_3 ()  {
        try {
            Main.calc("II-IX");
            Assert.fail();
        } catch (NegativeRomanNumberException thrown) {
            Assert.assertNotNull(thrown);
        }
    }
}