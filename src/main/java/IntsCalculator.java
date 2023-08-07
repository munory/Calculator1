public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    private int countResult(int arg0, int arg1, Calculator.Operation operation) {
        return (int) Math.round(target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(operation)
                .result());
    }

    @Override
    public int sum(int arg0, int arg1) {
        return countResult(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return countResult(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int a, int b) {
        return countResult(a, b, Calculator.Operation.POW);
    }

}