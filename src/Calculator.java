public class Calculator {
    public static int calculate(int firstOperand, int seconOperand, char operator) {
        final char ADDITION= '+';
        final char SUBTRUCTION = '-';
        final char MUTIPLICATION = '*';
        final char DIVISION = '/';
        switch (operator) {
            case ADDITION:
                return firstOperand + seconOperand;
            case SUBTRUCTION:
                return firstOperand - seconOperand;
            case MUTIPLICATION:
                return firstOperand * seconOperand;
            case DIVISION:
                if (seconOperand != 0)
                    return firstOperand / seconOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
