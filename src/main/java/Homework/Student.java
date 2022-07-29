package Homework;

public class Student {

    String firstName;
    String lastName;
    int age;
    int course;
    double mathAverage;
    double economicAverage;
    double foreignLanguageAverage;

    public Student(String firstName, String lastName, int age, int course,
                   double mathAverage, double economicAverage, double foreignLanguageAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
        this.mathAverage = mathAverage;
        this.economicAverage = economicAverage;
        this.foreignLanguageAverage = foreignLanguageAverage;

    }

    // средняя оценка
    public double getAverageGrade() {
        return (mathAverage + economicAverage + foreignLanguageAverage) / 3;
    }

    // вывод в консоль среднего бала
    public void outputGpa() {
        System.out.println("Средняя арифметическая оценка студента: " + firstName + " " + lastName + " " + "курса: " + course + " равна: "
                + getAverageGrade());
    }

    // повышение курса или отчисление
    public void getCourseUpOrExpelled(Student student) {
        if (getAverageGrade() < 3.0) {
            student.course = 0;
            System.out.println("Студент отчислен, курс: " + student.course);
        } else {
            student.course++;
            System.out.println("Студент зачислен на новый курс: " + student.course);
        }
    }

}



