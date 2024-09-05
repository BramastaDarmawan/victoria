public class Calculator {
    int a, b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return a + b;
    }
    public int subtract(){
        return a - b;
    }
    public int multiply(){
        return a * b;
    }
    public int devide(){
        return a / b;
    }
}
