import operations.CalculationOperation;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.next();
        String opp = scanner.next();
        String r = scanner.next();


        calc(new BigDecimal(l), new BigDecimal(r),opp);
    }

    public static BigDecimal calc(BigDecimal l, BigDecimal r, String opp){
        CalculationOperation operationClass = getOperationClass(opp);
        BigDecimal result = getCalcResult(l, r, operationClass);
        System.out.println("결과 : " + result);
        return result;
    }

    public static BigDecimal getCalcResult(BigDecimal l, BigDecimal r,CalculationOperation calculationOperation) {
        calculationOperation.setting(l,r);
        BigDecimal result = calculationOperation.calc();
        return result;
    }

    public static CalculationOperation getOperationClass(String opperation) {
        switch (opperation){
            case "Addition":
            case "+":
                return OperationKind.ADDITION.getCalculationOperation();
            case "Subtraction":
            case "-":
                return OperationKind.SUBTRACTION.getCalculationOperation();
            case "Multiplication":
            case "*":
                return OperationKind.MULTIPLICATION.getCalculationOperation();
            case "Division":
            case "/":
                return OperationKind.DIVISION.getCalculationOperation();
        }
        return null;
    }

}
