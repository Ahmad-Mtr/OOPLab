package Calculator;

public class Calc_Operations {


    public double Addition(double a, double b){
        return a+b;
    }
    public double Subtraction(double a, double b){
        return a-b;
    }
    public double Multiply(double a, double b){
        return a*b;
    }
    public double Division(double a, double b){
        return a/b;
    }
    public double Sin(Double degree){
        Double U = degree * (Math.PI/180);
        return Math.sin(U);
    }

    public double Cosin(Double degree){
        double U = degree * (Math.PI/180);
        return Math.cos(U);
    }
}
