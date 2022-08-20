package task.pair;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.util.UUID;

import static org.junit.Assert.*;

public class KeyServiceTest {

    @Test
    public void getHash() {
        KeyService keyService = new KeyService();
        String generateKeyFirst = "efb70671-9b0d-4763-a9cf-dd6165a873ee";
        String generateKeySecond = "88e44e41-176f-4caf-94d3-f618caf6147c";
        // 7067190476396165873 + 88444117649436186147 = 706719047639616587388444117649436186147
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);
        BigInteger result = keyService.getHash(pair);
        BigInteger expected = new BigInteger("706719047639616587388444117649436186147");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getHashWithoutNumbers() {
        KeyService keyService = new KeyService();
        String generateKeyFirst = "asfasffassf";
        String generateKeySecond = "asfasdf";
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);
        BigInteger result = keyService.getHash(pair);
        Assert.assertEquals(BigInteger.ZERO, result);
    }

    @Test(expected = NullPointerException.class)
    public void whenNull() {
        KeyService keyService = new KeyService();
        Pair pair = Pair.of(null, "sdfsdf");
    }
}