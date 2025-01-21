package Lesson06;

//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Lesson06H016 {
    public static void main(String[] args){
        double prom = 1;

        for(double x = 1; x <= 10; x++){
            int sum = 0;

            for(double i = 1; i <= x; i++){
                sum += i;
                //System.out.println(prom);
            }
            prom *= sum;
        }
        System.out.println(prom);
    }
}
