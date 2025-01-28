package Control13.Task01;

public class Main {
    public static void main(String[] args) {
      Equation equation = new Equation(0.5);

      System.out.println("Равенство при x = " + equation.getX() + " равняется: " + equation.calculate());

    }
}
