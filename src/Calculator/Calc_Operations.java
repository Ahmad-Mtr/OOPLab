package Calculator;

public class Calc_Operations {


    public float Addition(float a, float b){
        return a+b;
    }
    public float Subtraction(float a, float b){
        return a-b;
    }
    public float Multiply(float a, float b){
        return a*b;
    }
    public float Division(float a, float b){
        return a/b;
    }
    public Double Sin(Double degree){
        Double U = degree * (Math.PI/180);
        return Math.sin(U);
    }

    public Double Cosin(Double degree){
        Double U = degree * (Math.PI/180);
        return Math.cos(U);
    }
}
