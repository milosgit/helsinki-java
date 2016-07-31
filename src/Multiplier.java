
public class Multiplier {
    private int number;
    private int OtherNumber;

    public Multiplier(int number) {
        this.number = number;
    }

    public int multiply(int OtherNumber) {
        int result = OtherNumber*number;
        return result;
    }

}
