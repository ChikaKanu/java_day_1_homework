public class Calculator {
    private double result;

        public Calculator(double result){
            this.result = result;
        }

    public double add(double numberOne, double numberTwo) {
        return this.result = numberOne + numberTwo;
    }

    public double subtract(double numberOne, double numberTwo) {
            return this.result = numberOne - numberTwo;
    }

    public double multiply(double numberOne, int numberTwo) {
            return this.result = numberOne * numberTwo;
    }

    public double divide(double numberOne, double numberTwo) {
            return this.result = numberOne / numberTwo;
    }

}
