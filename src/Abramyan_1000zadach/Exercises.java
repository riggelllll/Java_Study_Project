package Abramyan_1000zadach;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Scanner;

/**
 * Абрамян 1000 задач по программированию
 */



public class Exercises {


    public static void main(String[] args) {

        Exercises.Boolean15 in1 = new Exercises().new Boolean15();
        in1.run();


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
    private class Integer11{
        private int number, leftN, midN, rightN, sum, composition;
        private static final int HUNDREAD = 100;
        private static final int DECIMAL = 10;
        Integer11(){
            number = 345;
        }
        private int getLeftN(){
            return leftN = number / HUNDREAD;
        }
        private int getMidN(){
            return midN = (number % HUNDREAD) / DECIMAL;
        }
        private int getRightN(){
            return rightN = (number % HUNDREAD) % DECIMAL;
        }
        private int getSum(){
            return sum = leftN + midN + rightN;
        }
        private int getComposition(){
            return composition = leftN * midN * rightN;
        }
        private void show(){
            getLeftN();
            getMidN();
            getRightN();
            getSum();
            getComposition();
            System.out.println("sum " + sum + " composition " + composition);
        }
    }
    private class Integer12{
        private int num, numAfter;
        Integer12(){
            num = 458;
        }
        private void getReverse(){
            Integer in = new Integer(num);
            StringBuffer buffer = new StringBuffer(in.toString());
            buffer = buffer.reverse();
            numAfter = Integer.parseInt(buffer.toString());
        }
        private void run(){
            getReverse();
            System.out.println("Before " + num + " After " + numAfter);
        }
    }
    private class Integer13{
        private int num;
        String str;
        Integer13(){
            num = 456;
        }
        private void getNewNum(){
            Integer in = new Integer(num);
            char tmp;
            StringBuffer buffer = new StringBuffer(in.toString());
            tmp = buffer.charAt(0);
            buffer.deleteCharAt(0);
            buffer.append(tmp);
            str = buffer.toString();
        }
        private void run(){
            getNewNum();
            System.out.println(str);
        }
    }
    private class Integer14{
        private int num;
        String str;
        Integer14(){
            num = 456;
        }
        private void getNewNum(){
            Integer in = new Integer(num);
            char tmp;
            StringBuffer buffer = new StringBuffer(in.toString());
            tmp = buffer.charAt(2);
            buffer.deleteCharAt(2);
            buffer.insert(0, tmp);
            str = buffer.toString();
        }
        private void run(){
            getNewNum();
            System.out.println(str);
        }
    }
    private class Integer15{
        private static final int NUM = 532;
        private int newNum;
        private void changeNum(){
            Integer in = new Integer(NUM);
            char tmp;

            StringBuffer buffer = new StringBuffer(in.toString());
            tmp = buffer.charAt(0);
            buffer.setCharAt(0, buffer.charAt(1));
            buffer.setCharAt(1, tmp);
            newNum = Integer.parseInt(buffer.toString());
        }
        private void run(){
            changeNum();
            System.out.println("Before " + NUM + " AFTER " + newNum);
        }
    }
    private class Integer16{
        private static final int NUM = 532;
        private int newNum;
        private void changeNum(){
            Integer in = new Integer(NUM);
            char tmp;

            StringBuffer buffer = new StringBuffer(in.toString());
            tmp = buffer.charAt(1);
            buffer.setCharAt(1, buffer.charAt(2));
            buffer.setCharAt(2, tmp);
            newNum = Integer.parseInt(buffer.toString());
        }
        private void run(){
            changeNum();
            System.out.println("Before " + NUM + " AFTER " + newNum);
        }
    }
    private class Integer17{
        private static final int NUM = 3456;
        private int num;
        private void getNum(){
            num = (NUM / 100) % 10;
        }
        private void run(){
            getNum();
            System.out.println(num);
        }
    }
    private class Integer18{
        private static final int NUM = 3456;
        private int num;
        private void getNum(){
            num = (NUM / 1000) % 10;
        }
        private void run(){
            getNum();
            System.out.println(num);
        }
    }
    private class Integer19{
        private int secunds, minutes;
        Integer19(){
            secunds = 3900;
        }
        private int getMinutes(){
            return  minutes = secunds / 60;
        }
        private void run(){
            getMinutes();
            System.out.println("secunds " + secunds + " minutes " + minutes);
        }
    }
    private class Integer20{
        private int secunds, hours;
        Integer20(){
            secunds = 3900;
        }
        private int getMinutes(){
            return  hours = secunds / 60 / 60;
        }
        private void run(){
            getMinutes();
            System.out.println("secunds " + secunds + " hours " + hours);
        }
    }
    private class Integer21{
        private int seconds, lastSeconds;
        private static final int SECONDS_IN_MINUTE = 60;
        Integer21(){
            seconds = 4567;
        }
        private int getLastSeconds(){
            return lastSeconds = seconds % SECONDS_IN_MINUTE;
        }
        private void run(){
            getLastSeconds();
            System.out.println("lastSeconds " + lastSeconds);
        }
    }
    private class Integer22{
        private int seconds, lastSeconds;
        private static final int SECONDS_IN_MINUTE = 60;
        private static final int MINUTES_IN_HOUR = 60;
        Integer22(){
            seconds = 4956;
        }
        private int getLastSeconds(){
            return lastSeconds = seconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR);
        }
        private void run(){
            getLastSeconds();
            System.out.println("lastSeconds " + lastSeconds);
        }
    }
    private class Integer23{
        private int seconds, lastMinutes;
        private static final int SECONDS_IN_MINUTE = 60;
        private static final int MINUTES_IN_HOUR = 60;
        Integer23(){
            seconds = 3665;
        }
        private int getLastSeconds(){
            return lastMinutes = (seconds % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)) / 60;
        }
        private void run(){
            getLastSeconds();
            System.out.println("lastMinutes " + lastMinutes);
        }
    }
    private class Integer24{
        private int randomDay, numberDayOfWeek;
        private static final int DAY_IN_WEEK = 7;
        Integer24(){
            randomDay = 142;
        }
        private int getNumberDayOfWeek(){
            return numberDayOfWeek = randomDay % DAY_IN_WEEK;
        }
        private void run(){
            getNumberDayOfWeek();
            System.out.println("день недели " + numberDayOfWeek);
        }

    }
    private class Integer25{
        private int randomDay, numberDayOfWeek;
        private static final int DAY_IN_WEEK = 7;
        private static final int FIRST_JANUARY_THURSDAY = 3;
        Integer25(){
            randomDay = 142;
        }
        private int getNumberDayOfWeek(){
            return numberDayOfWeek = (randomDay + FIRST_JANUARY_THURSDAY) % DAY_IN_WEEK;
        }
        private void run(){
            getNumberDayOfWeek();
            System.out.println("день недели " + numberDayOfWeek);
        }
    }
    private class Integer26{
        private int randomDay, numberDayOfWeek;
        private static final int DAY_IN_WEEK = 7;
        private static final int FIRST_JANUARY_THURSDAY = 2;
        Integer26(){
            randomDay = 142;
        }
        private int getNumberDayOfWeek(){
            return numberDayOfWeek = randomDay % (DAY_IN_WEEK + 1);
        }
        private void run(){
            getNumberDayOfWeek();
            System.out.println("день недели " + numberDayOfWeek);
        }
    }
    private class Integer27{
        private int randomDay, numberDayOfWeek;
        private static final int DAY_IN_WEEK = 7;
        private static final int FIRST_JANUARY_THURSDAY = 2;
        Integer27(){
            randomDay = 142;
        }
        private int getNumberDayOfWeek(){
            return numberDayOfWeek = (randomDay + 4) % (DAY_IN_WEEK + 1);
        }
        private void run(){
            getNumberDayOfWeek();
            System.out.println("день недели " + numberDayOfWeek);
        }
    }
    private class Integer29{
        private int a, b, c, quontity, freeSquare;
        Integer29(){
            a = 5;
            b = 3;
            c = 2;
        }
        private int getSquareQuontity(){
            return quontity = (a / c) * (b / c);
        }
        private int getFreeSquare(){
            int areaRectangle = a * b;
            int areaSquare = c * c;
            int areaSquares = areaSquare * quontity;
            return freeSquare = areaRectangle - areaSquares;

        }
        private void run(){
            getSquareQuontity();
            getFreeSquare();
            System.out.println("количество квадратов " + quontity + " Свободная площаль " + freeSquare);
        }
    }
    private class Integer30{
        private int year, century;
        Integer30(){
            year = 1850;
        }
        private int getCentury(){
            return century = ((year - 1) / (100)) + 1;
        }
        private void run(){
            getCentury();
            System.out.println("Century " + century);
        }

    }
    private class Boolean1{
        private int number;
        Boolean1(){
            number = 5;
        }
        private void run(){
            if (number > 0){
                System.out.println("Число положительно");
            }
        }
    }
    private class Boolean2{
        private int number;
        Boolean2(){
            number = 24;
        }
        private void run(){
            if (number % 2 != 0){
                System.out.println("Число нечетное");
            }else {
                System.out.println("Число четное");
            }
        }
    }
    private class Boolean3{
        private int number;
        Boolean3(){
            number = 20;
        }
        private void run(){
            if (number % 2 == 0){
                System.out.println("Число четное");
            }else {
                System.out.println("Число нечетное");
            }
        }

    }
    private class Boolean4{
        private int numberA, numberB;
        Boolean4(){
            numberA = 3;
            numberB = 10;
        }
        private void run(){
            if (numberA > 2 && numberB <= 3){
                System.out.println("Это правда");
            }else {
                System.out.println("Ложь");
            }
        }
    }
    private class Boolean5{
        private int numberA, numberB;
        Boolean5(){
            numberA = 3;
            numberB = 10;
        }
        private void run(){
            if (numberA >= 0 && numberB < -2){
                System.out.println("Это правда");
            }else {
                System.out.println("Ложь");
            }
        }
    }
    private class Boolean6{
        private int numberA, numberB, numberC;
        Boolean6(){
            numberA = 2;
            numberB = 5;
            numberC = 10;
        }
        protected void run(){
            if (numberA < numberB && numberB< numberC){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
    private class Boolean7 extends Boolean6{}
    private class Boolean8{
        private int numberA, numberB;
        Boolean8(){
            numberA = 5;
            numberB = 6;
        }
        private void run(){
            if (numberA % 2 != 0 && numberB % 2 != 0){
                System.out.println("Они нечетные ОБА");
            }else {
                System.out.println("Кто то четный");
            }
        }
    }
    private class Boolean9{
        private int numberA, numberB;
        Boolean9(){
            numberA = 2;
            numberB = 5;
        }
        private void run(){
            if (numberA % 2 != 0 || numberB % 2 != 0){
                System.out.println("Число нечетое");
            }
        }
    }
    private class Boolean10{
        private int numberA, numberB;
        Boolean10(){
            numberA = 2;
            numberB = 5;
        }
        private void run(){
            if ((numberA + numberB) % 2 != 0){
                System.out.println("ровно одно нечетное");
            }
        }
    }
    private class Boolean11{
        private int numberA, numberB;
        Boolean11(){
            numberA = 4;
            numberB = 4;
        }
        private void run(){
            if ((numberA + numberB) % 2 == 0){
                System.out.println("числа одинаковой четности");
            }else {
                System.out.println("Числа разной четноти");
            }
        }
    }
    private class Boolean12{
        private int numberA, numberB, numberC;
        Boolean12(){
            numberA = 4;
            numberB = -4;
            numberC = 5;
        }
        private void run(){
            if (numberA > 0 && numberB > 0 && numberC > 0){
                System.out.println("Все числа положительны");
            }else {
                System.out.println("Какое то число отрицательно");
            }
        }
    }
    private class Boolean13{
        private int numberA, numberB, numberC;
        Boolean13(){
            numberA = -4;
            numberB = -4;
            numberC = -5;
        }
        private void run(){
            if (numberA > 0 || numberB > 0 || numberC > 0){
                System.out.println("Хотя бы одно число положительно");
            }else {
                System.out.println("Все отрицательны");
            }
        }
    }
    private class Boolean14{
        private int numberA, numberB, numberC;
        private boolean bA, bB, bC;
        Boolean14(){
            numberA = 4;
            numberB = -4;
            numberC = -5;
        }
        private void run(){
            if (numberA > 0){bA = true;}
            if (numberB > 0){bB = true;}
            if (numberC > 0){bC = true;}

            if (bA ^ bB ^ bC){
                System.out.println("Ровно одно число положительно");
            }else {
                System.out.println("Не только одно положительно");
            }
        }
    }
    private class Boolean15{
        private int numberA, numberB, numberC;
        private boolean bA, bB, bC;
        Boolean15(){
            numberA = 4;
            numberB = -4;
            numberC = 5;
        }
        private void run(){
            int counter = 0;
            if (numberA > 0){bA = true; counter++;}
            if (numberB > 0){bB = true; counter++;}
            if (numberC > 0){bC = true; counter++;}

            if (counter == 2){
                System.out.println("Ровно два числа положительно");
            }else {
                System.out.println("Другой вариант");
            }
        }
    }
}


