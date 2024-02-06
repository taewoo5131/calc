package operations;

import java.math.BigDecimal;

public class Subtraction implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;

    public Subtraction() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public BigDecimal calc() {
        return left.subtract(right);
    }
}
