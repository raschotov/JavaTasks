package string;

public class BigString {

    private int length;

    private String value;

    public BigString(){}


    public BigString(String value, int length) {
        this.value = value;
        this.length = length;
    }

    @Override
    public String toString(){
        return this.value + ", " + this.length;
    }
}
