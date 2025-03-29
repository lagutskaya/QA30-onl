package HomeWorks.HW8_9.MainTasks.Task1;

public class MainOfFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 5);
        figures[2] = new Circle(3);
        figures[3] = new Triangle(5, 12, 13);
        figures[4] = new Rectangle(6, 7);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
        }

        System.out.println("Сумма периметра всех фигур в массиве: " + totalPerimeter);
    }
}
