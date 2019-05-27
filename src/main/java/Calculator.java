public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1(){
        return this.number1;
    }

    public int getNumber2(){
        return this.number2;
    }

    public int add(){
        return this.number1 + this.number2;
    }

    public int subtract(){
        return this.number1 - this.number2;
    }

    public int multiply(){
        return this.number1 * this.number2;
    }

    public double divide(){
        return this.number1 / this.number2;
    }
}
