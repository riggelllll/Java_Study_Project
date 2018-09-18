package Abramyan_1000zadach;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Scanner;

/**
 * Абрамян 1000 задач по программированию
 */



public class Exercises {


    public static void main(String[] args) {

        Exercises.Begin20 bg1 = new Exercises().new Begin20();
        bg1.showDistance();



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

}


