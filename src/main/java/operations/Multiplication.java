package operations;

import java.math.BigDecimal;

public class Multiplication implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;

    public Multiplication() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public BigDecimal calc() {
        System.out.println( left.multiply(right));
        return left.multiply(right);
    }
}
