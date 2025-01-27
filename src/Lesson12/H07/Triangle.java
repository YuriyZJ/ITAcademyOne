package Lesson12.H07;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

public class Triangle {
    int a;
    int b;
    int c;

    double S;
    double P;

    public Triangle(){
        a = 5;
        b = 2;
        c = 4;
    }

    public Triangle(int _a, int _b, int _c){
        if (_a == 0 || _b == 0 || _c == 0){
            throw new RuntimeException ("Одна из сторон равна 0");
        }
        if (_a + _b < _c || _a + _c < _b || _c + _b < _a){
            throw new RuntimeException ("Треугольник с данными значениями не может существовать. Введите значения повторно.");
        }
        a = _a;
        b = _b;
        c = _c;
    }

    public int getA (){
        return a;
    }

    public int getB (){
        return b;
    }

    public int getC (){
        return c;
    }

    public double P(){
        P = a + b + c;
        return P;
    }

    public double S(){
        double PPol = P / 2;
        S = Math.sqrt(PPol * (PPol - a) * (PPol - b) * (PPol - c));
        return S;
    }

}
