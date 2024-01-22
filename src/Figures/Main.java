package Figures;
import Figures.Circle;
import Figures.Figure;
import Figures.Rectangle;
import Figures.Triangle;
 //1. Написать иерархию классов «Фигуры».
//  Фигура -> Треугольник -> Прямоугольник -> Круг.
//  Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//  периметра.
//  Создать массив из 5 фигур.
//  Вывести на экран сумму периметра всех фигур в массиве.

public class Main {
    public static void main(String[] args) {

    Circle circle = new Circle(5);
    System.out.println(circle.getPerimeter());
    System.out.println(circle.getSqare());

    Rectangle rectangle = new Rectangle(4,6);
    System.out.println(rectangle.getPerimeter());
    System.out.println(rectangle.getSqare());

    Triangle triangle = new Triangle(4, 5, 6);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getSqare());

        Triangle triangle1 = new Triangle( 3, 5, 6);
        Triangle triangle2 = new Triangle( 6, 7, 4);

        Figure[] figures = {
                circle,
                rectangle,
                triangle,
                triangle1,
                triangle2};
        double sum = 0;
         for (Figure figure : figures){
              sum += figure.getPerimeter();
         }
         System.out.printf(" Сумма периметров фигуры : %s\n", sum);
    }
}
