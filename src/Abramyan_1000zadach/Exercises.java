package Abramyan_1000zadach;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Scanner;

/**
 * Абрамян 1000 задач по программированию
 */



public class Exercises {


    public static void main(String[] args) {

        Exercises.Integer10 in1 = new Exercises().new Integer10();
        in1.show();



    }

    private class Begin1{
        private int side;

        private int getPerimeter(){
            return 4 * side;
        }
        private void enterSide(){
            System.out.println("Введите размер стороны: ");
            Scanner in = new Scanner(System.in);
            side = in.nextInt();
        }
        private void showPerimeter(){
            System.out.println("Периметер равен = " + getPerimeter());
        }
        private void run(){
            enterSide();
            showPerimeter();
        }

    }
    private class Begin2{
        private int side;

        private int getSquare(){
            return side * side;
        }
        private void enterSide(){
            System.out.println("Введите размер стороны: ");
            Scanner in = new Scanner(System.in);
            side = in.nextInt();
        }
        private void showSquare(){
            System.out.println("Площадь равна = " + getSquare());
        }
        private void run(){
            enterSide();
            showSquare();
        }

    }
    private class Begin3{
        private int side1, side2;
        void enterSide(){
            System.out.println("Введите размеры сторон");
            Scanner in = new Scanner(System.in);
            side1 = in.nextInt();
            side2 = in.nextInt();
        }
        private void showSquarePerimeter(){
            System.out.println("Площадь равна = " + getSquare());
            System.out.println("Периметер равен = " + getPerimeter());
        }
        private int getSquare(){
            return side1 * side2;
        }
        private int getPerimeter(){
            return 2 * (side1 + side2);
        }
        private void run(){
            enterSide();
            showSquarePerimeter();
        }

    }
    private class Begin4{
        private static final double P = 3.14;
        private double diameter;
        private double length;

        private void enterDiameter(){
            System.out.println("Введите диаметр окружности");
            Scanner in = new Scanner(System.in);
            diameter = in.nextDouble();
        }
        private void showLength(){
            System.out.println("Длина окружности = " + getLength());
        }
        private double getLength(){
            length = diameter * P;
            return length;

        }

        private void run(){
            enterDiameter();
            showLength();
        }

    }
    private class Begin5{
        private int edgeLength;
        private int volume;
        private int square;

        private void enterEdgeLength(){
            System.out.println("Введите длину ребра куба ");
            Scanner in = new Scanner(System.in);
            edgeLength = in.nextInt();
        }

        private int getVolume(){
            volume = edgeLength * edgeLength * edgeLength;
            return volume;
        }

        private int getSquare(){
            square = 6 * (edgeLength * edgeLength);
            return square;
        }

        private void showVolumeSquare(){
            System.out.println("Обьем равен = " + getSquare() + " Площадь равна = " + getSquare());
        }

        private void run(){
            enterEdgeLength();
            showVolumeSquare();
        }


    }
    private class Begin6{
        private int edgeLength1;
        private int edgeLength2;
        private int edgeLength3;
        private int volume;
        private int square;

        private void enterEdges(){
            System.out.println("Введите длины ребер");
            Scanner in = new Scanner(System.in);
            edgeLength1 = in.nextInt();
            edgeLength2 = in.nextInt();
            edgeLength3 = in.nextInt();
        }
        private int getVolume(){
            volume = edgeLength1 * edgeLength2 * edgeLength3;
            return volume;
        }
        private int getSquare(){
            square = 2 * ((edgeLength1 * edgeLength2) + (edgeLength2 * edgeLength3) + (edgeLength1 * edgeLength3));
            return square;
        }
        private void showVolumeSquare(){
            System.out.println("Обьем равен = " + getVolume() + " Площадь равна = " + getSquare());
        }
        private void run(){
            enterEdges();
            showVolumeSquare();
        }
    }
    private class Begin7{
        private static final double P = 3.14;
        private double radius;
        private double length;
        private double square;

        private void enterRadius(){
            System.out.println("Введите радиус");
            Scanner in = new Scanner(System.in);
            radius = in.nextDouble();
        }
        private void showLengthSquare(){
            System.out.println("Длина равна = " + getLength() + " Площадь равна = " + getSquare());
        }
        private double getLength(){
            length = 2 * P * radius;
            return length;
        }
        private double getSquare(){
            square = P * (radius * radius);
            return square;
        }
        private void run(){
            enterRadius();
            showLengthSquare();
        }
    }
    private class Begin8{
        private int average(int a, int b){
            return (a+b) / 2;
        }

        private void run(int a, int b){
            System.out.println("Среднее арифметическое = " + average(a, b));;

        }
    }
    private class Begin9{
        private double geometricMean(double a, double b){
           if(a < 0 | b < 0){
               System.out.println("Значение должны быть положительными");
           }
           return Math.sqrt(a * b);
        }
        private void run(){
            System.out.println("Среднеее геометрическое " + geometricMean(5,5 ));
        }
    }
    private class Begin10{
        private int a , b;

        private void enterValues(){
            System.out.println("Введите значения ");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            b = in.nextInt();
        }
        private int sum(){
            return a + b;
        }
        private int difference(){
            return a - b;
        }
        private int composition(){
            return a * b;
        }
        private int quotient(){
            return (int)(Math.pow(a , 2) / Math.pow(b , 2));
        }
        private void run(){
            enterValues();
            System.out.println("Сумма = " + sum() + " Разница = " + difference() + " Произведение = " + composition() + " Частное = " + quotient());
        }


    }
    private class Begin12{
        private int catheter1, catheter2, hypotenuse, perimeter;

        private void enterCatheters(){
            System.out.println("Введите значения ");
            Scanner in = new Scanner(System.in);
            catheter1 = in.nextInt();
            catheter2 = in.nextInt();
        }

        private int getHypotenuse(){
            return (int)Math.sqrt(Math.pow(catheter1, 2) + Math.pow(catheter2, 2));
        }
        private int getPerimeter(){
            return catheter1 + catheter2 + hypotenuse;
        }
        private void run(){
            enterCatheters();
            System.out.println("Гипотенуза равна = " + getHypotenuse() + " Периметер равен = " + getPerimeter());
        }

    }
    private class Begin13{
        private int r1, r2; //R1 > R2
        private double s1, s2, s3;
        private static final double P = 3.14;

        private void enterRadius(){
            System.out.println("Введите радиусы");
            Scanner in = new Scanner(System.in);
            r1 = in.nextInt();
            r2 = in.nextInt();
        }
        private double getSquare(int radius){
           return P * Math.pow(radius, 2);
        }
        private double getS3(){
            return s1 -s2;
        }
        private void run(){
            enterRadius();
            System.out.println("S1 = " + getSquare(r1) + " S2 = " + getSquare(r2) + " S3 = " + getS3());
        }
    }
    private class Begin14{
        private static final double P = 3.14;
        private double length, radius, square;

        private void enterLength(){
            System.out.println("Введите длину окружности");
            Scanner in = new Scanner(System.in);
            length = in.nextInt();
        }
        private double getRadius(){
            return length / (2 * P);
        }
        private double getSquare(){
            return P * Math.pow(getRadius(), 2);
        }
        private void run(){
            enterLength();
            System.out.println("Радиус равен = " + getRadius() + " Площадь равна = " + getSquare());
        }
    }
    private class Begin15{
        private double square, diameter, length;
        private static final double P = 3.14;

        private void enterSquare(){
            System.out.println("Введите площадь круга");
            Scanner in = new Scanner(System.in);
            square = in.nextInt();
        }
        private double getDiameter(){
            return Math.sqrt(square / P);
        }
        private double getLength(){
            return P * getDiameter();
        }

        private void run(){
            enterSquare();
            System.out.println("Диаметр  = " + getDiameter() + " Длина = " + getLength());
        }
    }
    private class Begin16{
        private int getDistance(int a, int b){
            return Math.abs(b - a);
        }
        private void run(){
            System.out.println("Растояние = " + getDistance(5, 2));
        }

    }
    private class Begin17{
        private class Point{
            private int coordinate;
            Point(int coordinate){
                this.coordinate = coordinate;
            }
        }

        private class Segment{
            private int getLength(Point a, Point b){
                return b.coordinate - a.coordinate;
            }
            private int getLengthSum(int a, int b){
                return a + b;
            }
        }
    }
    private class Begin19{
        private class Point{
            private int coordX, coordY;
            Point(int coordX, int coordY){
                this.coordX = coordX;
                this.coordY = coordY;
            }
        }
        private class Rectangle{
            private Point p1 = new Point(1, 1);
            private Point p2 = new Point(5, 5);
            private int lengthSide1, lengthSide2;
            private void getSidesLength(){
                lengthSide1 = p2.coordX - p1.coordX;
                lengthSide2 = p2.coordY - p1.coordY;
            }
            private int getPerimeter(){
                return (lengthSide1 + lengthSide2) * 2;
            }
            private int getSquare(){
                return lengthSide1 * lengthSide2;
            }
            private void show(){
                getSidesLength();
                System.out.println("Периметер = " + getPerimeter() + " Площадь = " + getSquare());
            }
        }

     private void func(){
            Rectangle r = new Rectangle();
            r.show();
     }



    }
    private class Begin20{
        private class Point{
            private int coordX, coordY;
            Point(int coordX, int coordY){
                this.coordX = coordX;
                this.coordY = coordY;
            }
        }
        private void showDistance(){
            Point p1 = new Point(1, 1);
            Point p2 = new Point(5, 5);
            int distance = (int)Math.sqrt(Math.pow((p2.coordX - p1.coordX), 2) + Math.pow((p2.coordY - p1.coordY), 2));
            System.out.println("Растояние  = " +  distance);
        }
    }
    private class Begin21{
        private class Point{
            private int coordX, coordY;
            Point(int coordX, int coordY){
                this.coordX = coordX;
                this.coordY = coordY;
            }
        }
        private class Triangle{
            private Point p1, p2, p3;
            private int side1, side2, side3;
            private int perimeter, square;
            Triangle(){
                p1 = new Point(1,1);
                p2 = new Point(3,3);
                p3 = new Point(5,5);
            }
            private int getDistance(Point p1, Point p2){
                return (int)Math.sqrt(Math.pow((p2.coordX - p1.coordX), 2) + Math.pow((p2.coordY - p1.coordY), 2));
            }
            private void setDistance(){
                side1 = getDistance(p1, p2);
                side2 = getDistance(p2, p3);
                side3 = getDistance(p1, p3);
            }
            private int getPerimeter(){
                return perimeter = side1 + side2 + side3;
            }
            private int getSquare(){
                return square = (int)Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
            }
        }
        private void run(){
            Triangle triangle = new Triangle();
            triangle.setDistance();
            triangle.getPerimeter();
            triangle.getSquare();
            System.out.println("Периметер = " + triangle.perimeter + " Площадь = " + triangle.getSquare());
        }
    }
    private class Begin22{
        private int a, b;
        Begin22(){
            a = 5;
            b = 10;
        }
        private void swap(){
            System.out.println("A and B before " + a + " " + b);
            a = a * b;
            b = a / b;
            a = a / b;
            System.out.println("A and B after " + a + " " + b);
        }
    }
    private class Begin23{
        private int a, b, c, x;

        Begin23(){
             a = 5;
             b = 10;
             c = 15;
        }

        private void swap(){
            System.out.println("Before " + a + " " + b + " " + c);
            x = b;
            b = a;
            a = c;
            c = x;
            System.out.println("After " + a + " " + b + " " + c);
        }
    }
    private class Begin24{
        private int a, b, c, x;

        Begin24(){
            a = 5;
            b = 10;
            c = 15;
        }
        private void swap(){
            System.out.println("Before " + a + " " + b + " " + c);
            x = c;
            c = a;
            a = b;
            b = x;
            System.out.println("After " + a + " " + b + " " + c);
        }

    }
    private class Begin25{
        private static final int x = 5;
        private int findY(){
            return (int)(3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7);
        }
        private void run(){
            System.out.println("Y равен " + findY());
        }

    }
    private class Begin26{
        private static final int x = 5;
        private int findY(){
            return (int)(4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2);
        }
        private void run(){
            System.out.println("Y равен " + findY());
        }
    }
    private class Begin27{
        private int a, a2, a4, a8;
        private static final int x = 2;
        private void getA(){
            a2 = x * x;
            a4 = a2 * a2;
            a8 = a4 * a4;
            System.out.println("A^2 = " + a2 + " A^4 = " + a4 + " A8 = " + a8);
        }
    }
    private class Begin28{
        private int a, a2, a3, a5, a10, a15;
        private static final int x = 2;
        Begin28(){
            a = x;
        }
        private void getA(){
            a2 = x * x;
            a3 = a2 * a;
            a5 = a3 * a2;
            a10 = a5 * a5;
            a15 = a10 * a5;
            System.out.println("A^2 = " + a2 + " A^3 = " + a3 + " A5 = " + a5 + " A10 = " + a10 + " A15 = " + a15);
        }
    }
    private class Begin29{
        private int alpha;
        private static final double P = 3.14;
        private void enterAlpha(){
            do {
                System.out.println("Введите значение угла в градусах");
                Scanner in = new Scanner(System.in);
                alpha = in.nextInt();
            }while (alpha < 0 || alpha > 360);
        }

        private double getRadians(){
            return alpha * (P / 180);
        }

        private void show(){
            enterAlpha();
            System.out.println("Значение в радианах " + getRadians());
        }
    }
    private class Begin30{
        private int alpha;
        private static final double P = 3.14;

        private void enterAlpha(){
            do {
                System.out.println("Введите значение угла в градусах");
                Scanner in = new Scanner(System.in);
                alpha = in.nextInt();
            }while (alpha < 0 || alpha > 2 * P);
        }

        private double getRadians(){
            return alpha * (P / 180);
        }

        private void show(){
            enterAlpha();
            System.out.println("Значение в радианах " + getRadians());
        }
    }
    private class Begin31{
        private double temperatureF;

        private void enterTemperature(){
            System.out.println("Введите значение температуры");
            Scanner in = new Scanner(System.in);
            temperatureF = in.nextDouble();
        }
        private double getTemperatureC(){
            return (temperatureF - 32) * 5 / 9;
        }
        private void showT(){
            enterTemperature();
            System.out.println("Температура " + (int)getTemperatureC());
        }

    }
    private class Begin32{
        private double temperatureC;

        private void enterTemperature(){
            System.out.println("Введите значение температуры");
            Scanner in = new Scanner(System.in);
            temperatureC = in.nextDouble();
        }
        private double getTemperatureF(){
            return temperatureC * 1.8 + 32;
        }
        private void showT(){
            enterTemperature();
            System.out.println("Температура " + (int)getTemperatureF());
        }
    }
    private class Begin33{
        private int a, x, kg1, ykg,  y;
        Begin33(){
            a = 80;
            x = 10;
            y = 5;
        }
        private int getKg1(){
            return kg1 =  a / x;
        }
        private int getYkg(){
            return ykg = kg1 * y;
        }
        private void show(){
            getKg1();
            getYkg();
            System.out.println("Килограм = " + kg1 + " Yкг = " + ykg);
        }

    }
    private class Begin34{
        private int x, a, y, b, kg1Shok, kg1Iris;
        private double dif;
        Begin34(){
            x = 10;
            a = 80;
            y = 5;
            b = 100;
        }
        private void getPrices(){
            kg1Shok = a / x;
            kg1Iris = b / y;
        }
        private void getDif(){
            dif = kg1Shok / kg1Iris;
        }
        private void show(){
            getPrices();
            getDif();
            System.out.println("1kgshok " + kg1Shok + " 1kgiris " + kg1Iris + " Diff " + dif);
        }
    }
    private class Begin35{
        private double v, u, t1, t2, s;
        Begin35(){
            v = 30;
            u = 5;
            t1 = 2;
            t2 = 1;
        }
        private double getS(){
            double sLake = t1 * v;
            double sRiver = t2 * (v - u);
            return sLake + sRiver;
        }
        private void show(){
            System.out.println("Путь равен " + getS());
        }
    }
    private class Begin36{
        private int v1, v2, s, t, diffS, fullS;
        Begin36(){
            v1 = 60;
            v2 = 100;
            s = 1000;
            t = 2;

        }
        private int getDiffS(){
            return diffS = (t * (v1 + v2));
        }
        private void show(){
            getDiffS();
            System.out.println("растояние = " + (diffS + s));
        }
    }
    private class Begin37{
        private int v1, v2, s, t, diffS;
        Begin37(){
            v1 = 60;
            v2 = 100;
            s = 1000;
            t = 2;
        }
        private int getDiffS(){
            return diffS = (t * (v1 + v2));
        }
        private void show(){
            getDiffS();
            System.out.println("растояние = " + (Math.abs(diffS - s)));
        }
    }
    private class Begin38{
        private int a, b;
        private int getX(){
            return -(b / a);
        }
    }
    private class Begin39{
        private int a, b, c, d, x1, x2;
        Begin39(){
            a = 3;
            b = 10;
            c = 7;
        }
        private int getD(){
            return d = (int)Math.pow(b, 2) - 4 * a * c;
        }
        private void getX(){
            x1 = (int)(-b + Math.sqrt(d)) / (2 * a);
            x2 = (int)(-b - Math.sqrt(d)) / (2 * a);
        }
        private void show(){
            getD();
            getX();
            System.out.println("корни = " + x1 + " " + x2);
        }
    }
    private class Begin40{
        private int a1, b1, c1, a2, b2, c2, x, y, d;
        Begin40(){
            a1 = 2;
            a2 = 20;
            b1 = 3;
            b2 = 30;
            c1 = 2;
            c2 = 20;
        }
        private int getD(){
            return d = a1 * b2 - a2 * b1;
        }
        private void getXY(){
            x = (c1 * b2 - c2 * b1) / d;
            y = (a1 * c2 - a2 * c1) / d;
        }

    }
    private class Integer1{
        private int lengthCm, lengthM;
        private int meter = 100;
        Integer1(){
            lengthCm = 535;
        }
        private int getLengthM(){
            return lengthM = lengthCm / meter;
        }
        private void run(){
            getLengthM();
            System.out.println("В сантиметрах " + lengthCm + " В метрах " + lengthM);
        }
    }
    private class Integer2{
        private int weightKg, weightT;
        private static final int ton = 1000;
        Integer2(){
            weightKg = 3500;
        }
        private int getLengthM(){
            return weightT = weightKg / ton;
        }
        private void run(){
            getLengthM();
            System.out.println("В килограммах " + weightKg + " В тоннах " + weightT);
        }

    }
    private class Integer3{
        private int fileByteSize, fileKbSize ;
        private static final int KB = 1024;
        Integer3(){
            fileByteSize = 3500;
        }
        private int getLengthM(){
            return fileKbSize = fileByteSize / KB;
        }
        private void run(){
            getLengthM();
            System.out.println("В fileByteSize " + fileByteSize + " В fileKbSize " + fileKbSize);
        }

    }
    private class Integer4{
        private int a, b, segments;
        Integer4(){
            a = 20;
            b = 7;
        }
        private int getSegments(){
            return segments =  a / b;
        }
        private void run(){
            getSegments();
            System.out.println("Количество сегментов " + segments);
        }
    }
    private class Integer5{
        private int a, b, freeSegments;
        Integer5(){
            a = 20;
            b = 7;
        }
        private int getSegments(){
            return freeSegments =  a % b;
        }
        private void run(){
            getSegments();
            System.out.println("Количество сегментов " + freeSegments);
        }
    }
    private class Integer6{
        private int number, leftN, rightN;
        private static final int DECIMAL = 10;
        Integer6(){
            number = 12;
        }
        private void getNumbers(){
            leftN = number / DECIMAL;
            rightN = number % DECIMAL;
        }
        private void run(){
            getNumbers();
            System.out.println("Левая цифра " + leftN + " Правая цифра " + rightN);
        }
    }
    private class Integer7{
        private int number, leftN, rightN, sum,composition;
        private static final int DECIMAL = 10;
        Integer7(){
            number = 12;
        }
        private void getNumbers(){
            leftN = number / DECIMAL;
            rightN = number % DECIMAL;
        }
        private int getSum(){
            return sum = leftN + rightN;
        }
        private int getComposition(){
            return composition = leftN * rightN;
        }
        private void run(){
            getNumbers();
            getComposition();
            getSum();
            System.out.println("sum " + sum + " composition " + composition);
        }
    }
    private class Integer8{
        private int number, leftN, rightN, reverse;
        private static final int DECIMAL = 10;
        Integer8(){
            number = 12;
        }
        private void getNumbers(){
            leftN = number / DECIMAL;
            rightN = number % DECIMAL;
        }
        private void getReverse(){
            StringBuffer buffer = new StringBuffer();
            buffer.append(rightN);
            buffer.append(leftN);
            System.out.println(buffer);reverse = new Integer(buffer.toString());
        }
        private void run(){
            getNumbers();
            getReverse();
            System.out.println("Before " + number + " After " + reverse);
        }
    }
    private class Integer9{
        private int number, leftN;
        private static final int hundread = 100;
        Integer9(){
            number = 345;
        }
        private int getLeftN(){
            return leftN = number / hundread;
        }
        private void show(){
            getLeftN();
            System.out.println("Num " + number + " left " + leftN);
        }
    }
    private class Integer10{
        private int number, midN, rightN;
        private static final int HUNDREAD = 100;
        private static final int DECIMAL = 10;
        Integer10(){
            number = 345;
        }
        private int getMidN(){
            return midN = (number % HUNDREAD) / DECIMAL;
        }
        private int getRightN(){
            return rightN = (number % HUNDREAD) % DECIMAL;
        }
        private void show(){
            getMidN();
            getRightN();
            System.out.println("Right " + rightN + " mid " + midN);
        }
    }

}


