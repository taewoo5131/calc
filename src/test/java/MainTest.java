import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void 더하기_테스트() {
        // given
        BigDecimal l = new BigDecimal("10");
        BigDecimal r = new BigDecimal("20");
        String opp = "+";

        // when
        BigDecimal calc = Main.calc(l, r, opp);

        // then
        Assertions.assertEquals(calc,new BigDecimal("30"));
    }

    @Test
    void 빼기_테스트() {
        // given
        BigDecimal l = new BigDecimal("5.5");
        BigDecimal r = new BigDecimal("3.2");
        String opp = "-";

        // when
        BigDecimal calc = Main.calc(l, r, opp);

        // then
        Assertions.assertEquals(calc,new BigDecimal("2.3"));
    }

    @Test
    void 나누기_테스트() {
        // given
        BigDecimal l = new BigDecimal("8");
        BigDecimal r = new BigDecimal("2");
        String opp = "/";

        // when
        BigDecimal calc = Main.calc(l, r, opp);

        // then
        Assertions.assertEquals(calc,new BigDecimal("4"));
    }

    @Test
    void 곱하기_테스트() {
        // given
        BigDecimal l = new BigDecimal("1.1");
        BigDecimal r = new BigDecimal("1.1");
        String opp = "*";

        // when
        BigDecimal calc = Main.calc(l, r, opp);

        // then
        Assertions.assertEquals(calc,new BigDecimal("1.21"));
    }
}