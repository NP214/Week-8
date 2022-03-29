package Week8;

public class P18SimpleCalculator {
    double firstnumber , secondnumber;

    public double getFirstnumber() {
        return firstnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setFirstNumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public void setSecondNumber(double secondnumber) {
        this.secondnumber = secondnumber;
    }
    public double getAdditionResult(){
        double addition = this.firstnumber + this.secondnumber;
        return addition;
    }
    public double getSubtractionResult(){
        double subtraction = this.secondnumber - this.firstnumber;
        return subtraction;
    }
    public double getMultiplicationResult(){
double multiplication = this.firstnumber * this.secondnumber;
return multiplication;
    }
    public double getDivisionResult () {
        double division = this.firstnumber / this.secondnumber;

        if (this.secondnumber == 0) {
            division = 0;

        } else {
            division = this.firstnumber / this.secondnumber;

        }
        return division;


    }

    public static void main(String[] args) {
        P18SimpleCalculator calculator = new P18SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
