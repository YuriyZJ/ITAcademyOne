package Control13.Task02;

public class Equation {
    private double y;
    private double a = 0.5;
    private double b = 1.0;
    private double x = 0.05;

/*    public Equation(double _x){
        if (_x == 2/3){
            throw new RuntimeException ("Делить на 0 нельзя. Введите другое значение.");
        }
        x = _x;
    }

    public double getX(){
        return x;
    }*/

    public void calculate (){
        int counter = 0;
        for (double i = a; a <= b; a += x) {
            y = (Math.sqrt(Math.pow(Math.E, 2.2 * a))) - Math.abs(Math.sin((Math.PI * a) / (a + 2.0 / 3.0))) + 1.7;
            counter++;
            System.out.println(counter + "/"+ a + "/" + y);
        }
        System.out.println();
    }

}
