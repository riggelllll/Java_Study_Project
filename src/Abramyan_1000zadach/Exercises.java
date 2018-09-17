package Abramyan_1000zadach;

import java.util.Scanner;

/**
 * Абрамян 1000 задач по программированию
 */



public class Exercises {


    public static void main(String[] args) {

        Exercises.Begin7 bg1 = new Exercises().new Begin7();
        bg1.run();

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

}


