public class Rupee {
    public final int value;

    public Rupee(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rupee rupee = (Rupee) o;
        return value == rupee.value;
    }

    public Rupee add(Rupee rupee) {
        int val = this.value + rupee.value;
        return new Rupee(val);
    }

}
