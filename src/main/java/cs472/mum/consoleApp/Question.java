package cs472.mum.consoleApp;

public class Question {
    private int number1;
    private int number2;
    private Operator operator;
    private int result;
    private boolean passed;

    public Question(int number1, String operator, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.passed = false;

        if (operator == "+") {
            this.result = number1 + number2;
            this.operator = Operator.SUM;
        } else if (operator == "-"){
            this.result = number1 - number2;
            this.operator = Operator.MIN;
        }else if(operator == "*") {
            this.result = number1 * number2;
            this.operator = Operator.MUL;
        }else if(operator == "^") {
            this.result = (int) Math.pow(number1, number2);
            this.operator = Operator.POW;
        }else
            this.result = 0;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public Operator getOperator() {
        return operator;
    }

    public int getResult() {
        return result;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }


    public String getQuestion(){
        return +number1+" "+operator.getValue()+" "+number2+" ?";
    }
}

enum Operator {
    SUM("+"),
    MIN("-"),
    MUL("*"),
    POW("^");

    String value;

    Operator(String v){
        this.value = v;
    }

    String getValue(){
        return this.value;
    }
}
