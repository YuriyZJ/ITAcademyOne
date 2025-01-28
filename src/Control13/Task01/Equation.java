package Control13.Task01;

public class Equation {
    private double x;
    private double y;

    public Equation(double _x){
        if (_x == 2/3){
            throw new RuntimeException ("Делить на 0 нельзя. Введите другое значение.");
        }
        x = _x;
    }

    public double getX(){
        return x;
    }

    public double calculate (){
        y = (Math.sqrt(Math.pow(Math.E, 2.2 * x))) - Math.abs(Math.sin((Math.PI * x)/(x + 2.0/3.0))) + 1.7;
        return y;
    }

}
