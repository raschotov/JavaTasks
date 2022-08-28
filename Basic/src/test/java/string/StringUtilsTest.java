package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

	@Test
	public void getTheBiggestStringFromArray() {
		String[] testStringsArray = new String[]{"Каждый", "охотник", "желает", "знать", "где", "сидит", "фазан"};
		StringUtils stringUtils = new StringUtils();

		BigString expected = new BigString("охотник", 7);
		BigString result = StringUtils.getTheBiggestStringFromArray(testStringsArray);

		Assert.assertEquals(expected.toString(), result.toString());
	}
}