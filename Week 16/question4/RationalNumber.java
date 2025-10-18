class RationalNumber {
    private final int num;
    private final int den;

    public RationalNumber(int n, int d) {
        assert d > 0; // the assert is use to check if the condition written in front of it is
        // true or not if yes then go ahead or else crash the program and throws an
        // error
        this.num = n;
        this.den = d;
    }

    public boolean equals(RationalNumber r) {
        return this.num == r.num && this.den == r.den;
    }

}