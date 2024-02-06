import operations.*;

public enum OperationKind {

    ADDITION("+", new Addition()),
    SUBTRACTION("-", new Subtraction()),
    MULTIPLICATION("*", new Multiplication()),
    DIVISION("/", new Division())
    ;

    private String operation;
    private CalculationOperation calculationOperation;

    OperationKind(String operation, CalculationOperation calculationOperation) {
        this.operation = operation;
        this.calculationOperation = calculationOperation;
    }

    public String getOperation() {
        return operation;
    }

    public CalculationOperation getCalculationOperation() {
        return calculationOperation;
    }
}