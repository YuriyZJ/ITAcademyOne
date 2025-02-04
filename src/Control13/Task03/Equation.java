package Control13.Task03;

public class Equation {
    int n = 20;
    double x = 0.5;
    double y;

    double nominator;
    double denominator;

    Equation() {

    }

    public void calculate() {
        double sum = 0;
        for (int k = 1; k <= n; k++) {
            nominator = (Math.sin((k*x)/2)) + (Math.sin((k*x - 1)/2));
            denominator = Math.exp((x-1)/k);
            sum += nominator / denominator;
        }

        y = Math.sqrt(n * Math.PI) * sum;
        System.out.println(y);
    }
}
