import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class StringUtilsTest {

    private StringUtils classUnderTest;

    @Before
    public void setUp() {
        System.out.println("Metoda zostanie wykonana przed kazdym testem");
        classUnderTest = new StringUtils();

    }

    @After
    public void tearDown() {
        System.out.println("Metoda zostanie wykonana po kazdym tescie");
    }

    @Test
    public void isValidZipCodeTest() throws Exception {
        String a = "05-120";
        String b = "10-990";
        String c = "ab-cdE";

        boolean isValid = classUnderTest.isValidZipCode(a);
        boolean isValid2 = classUnderTest.isValidZipCode(b);
        boolean isValid3 = classUnderTest.isValidZipCode(c);

        Assert.assertTrue("Invalid Zip Code.", isValid);
        Assert.assertTrue("Invalid Zip Code.", isValid2);
        Assert.assertFalse("Invalid Zip Code.", isValid3);
    }

    @Test
    public void toUpperCaseTest() throws Exception {
        String a = "abc";
        String b = "xyz";

        String upper = classUnderTest.toUpperCase(a);
        String upper2 = classUnderTest.toUpperCase(b);

        Assert.assertEquals("Lower to Upper conversion has failed.", "ABC", upper);
        Assert.assertEquals("Lower to Upper conversion has failed.", "XYZ", upper2);
    }

    @Test
    public void toLowerCaseTest() throws Exception {
        String a = "ABC";
        String b = "XYZ";

        String lower = classUnderTest.toLowerCase(a);
        String lower2 = classUnderTest.toLowerCase(b);

        Assert.assertEquals("Upper to Lower conversion has failed.", "abc", lower);
        Assert.assertEquals("Upper to Lower conversion has failed.", "xyz", lower2);
    }

    @Test
    public void isFemaleNameTest() throws Exception {
        String a = "Halina";
        String b = "Beata";
        String c = "Jurek";

        boolean isFemale = classUnderTest.isFemaleName(a);
        boolean isFemale2 = classUnderTest.isFemaleName(b);
        boolean isFemale3 = classUnderTest.isFemaleName(c);

        Assert.assertTrue("Invalid sex test", isFemale);
        Assert.assertTrue("Invalid sex tes", isFemale2);
        Assert.assertFalse("Invalid sex tes", isFemale3);
    }

    @Test
    public void replaceSpacesWithUnderscore() throws Exception {
        String a = "abc cde fgh";
        String b = " xYz eRt ";

        String replace = classUnderTest.replaceSpacesWithUnderscore(a);
        String replace2 = classUnderTest.replaceSpacesWithUnderscore(b);

        Assert.assertEquals("Character replacing error", "abc_cde_fgh", replace);
        Assert.assertEquals("Character replacing error", "_xYz_eRt_", replace2);
    }

    @Test
    public void countWordsInSentence() throws Exception {
        String a = "Ala ma kota Alika";
        String b = "kopytko";

        int count = classUnderTest.countWordsInSentence(a);
        int count2 = classUnderTest.countWordsInSentence(b);

        Assert.assertEquals("Words counting error", 4, count);
        Assert.assertEquals("Words counting error", 1, count2);
    }
}

