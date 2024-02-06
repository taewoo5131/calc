package operations;

import java.math.BigDecimal;

public class Addition implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;

    public Addition() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public BigDecimal calc() {
        return left.add(right);
    }
}
