public class Calculator {
    private double num1;
    private double num2;
    private double result;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    public void add() {
        setResult(num1 + num2);
    }

    public void multiply() {
        setResult(num1 * num2);
    }
}
