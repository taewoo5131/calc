package operations;

import java.math.BigDecimal;

public class Division implements CalculationOperation {
    private BigDecimal left;
    private BigDecimal right;

    public Division() {}

    @Override
    public void setting(BigDecimal l, BigDecimal r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public BigDecimal calc() {
        BigDecimal divide;
        try {
             divide = left.divide(right);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            throw new IllegalArgumentException(e);
        }
        return divide;
    }
}
