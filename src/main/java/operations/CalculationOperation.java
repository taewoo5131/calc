package operations;

import java.math.BigDecimal;

public interface CalculationOperation {
    void setting(BigDecimal l, BigDecimal r);
    BigDecimal calc();
}
