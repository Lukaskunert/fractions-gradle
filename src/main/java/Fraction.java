public class Fraction implements IFraction {

    private final Integer numerator;
    private final Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) throw new ArithmeticException("Cannot Divide by 0");
    }

    @Override
    public Integer getNumerator() {
        return numerator;
    }

    @Override
    public Integer getDenominator() {
        return denominator;
    }

    @Override
    public IFraction plus(IFraction other) {
        int SpolJmenovatel = getDenominator() * other.getDenominator();
        int Citatel = (getNumerator() * other.getDenominator()) + (other.getNumerator() * getDenominator());
        return new Fraction(Citatel, SpolJmenovatel);
    }

    @Override
    public IFraction minus(IFraction other) {
        int SpolJmenovatel = getDenominator() * other.getDenominator();
        int Citatel = (getNumerator() * other.getDenominator()) - (other.getNumerator() * getDenominator());
        return new Fraction(Citatel, SpolJmenovatel);
    }

    @Override
    public IFraction times(IFraction other) {
        int SpolJmenovatel = getDenominator() * other.getDenominator();
        int Citatel = getNumerator() * other.getNumerator();
        return new Fraction(Citatel, SpolJmenovatel);
    }

    @Override
    public IFraction dividedBy(IFraction other) {
        int SpolJmenovatel = getDenominator() * other.getNumerator();
        int Citatel = other.getDenominator() * getNumerator();
        return  new Fraction(Citatel, SpolJmenovatel);
    }

    public static Fraction createNormalised(Integer numerator, Integer denominator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Fraction " + numerator + "|" + denominator;
    }
}
