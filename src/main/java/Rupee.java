public class Rupee {
    public int value;
    public int serialNo;

    public Rupee(int value, int serialNo) {
        this.value = value;
        this.serialNo = serialNo;
    }

    public boolean compareRupee(Rupee rupee) {
        return rupee == this;
    }
}
