package question5;

public class RationalNumber2 {
    private final int num;
    private final int den;

    public RationalNumber2(int n, int d) {
        assert d < 0;
        this.den = d;
        this.num = n;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;

        if (!(other instanceof RationalNumber2))
            // this will check that the obj is really the instance / the rationalNumber or
            // else ? if yes so return false
            return false;

        RationalNumber2 that = (RationalNumber2) other;
        return this.den == that.den && this.num == that.num;
    }
}
