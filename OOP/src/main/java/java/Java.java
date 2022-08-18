package java;

import java.util.Random;

public class Java {

    protected long uniqueId = Math.abs(new Random().nextLong());

    long otherId = Math.abs(new Random().nextLong());

    protected int version() {
        return 8;
    }
}
