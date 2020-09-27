package student_artur_martinenko.homework.lesson_8.level_5_middle;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    @Override
    public String toString() {
        return title;
    }

}
