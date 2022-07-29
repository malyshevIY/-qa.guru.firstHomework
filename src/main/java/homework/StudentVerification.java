package homework;

public class StudentVerification {

    public static void main(String[] args) {
        Student firstStudent = new Student("Ivan", "Ivanov", 18, 1,
                4.6, 4.5, 4.7);
        Student secondStudent = new Student("Dima", "Petrov", 20, 3,
                3.5, 4.0, 4.5);
        Student thirdStudent = new Student("Sasha", "ShipOFF", 22, 5,
                2.9, 2.8, 2.5);

        firstStudent.getAverageGrade();
        firstStudent.outputGpa();
        firstStudent.getCourseUpOrExpelled(firstStudent);

        secondStudent.getAverageGrade();
        secondStudent.outputGpa();
        secondStudent.getCourseUpOrExpelled(secondStudent);

        thirdStudent.getAverageGrade();
        thirdStudent.outputGpa();
        thirdStudent.getCourseUpOrExpelled(thirdStudent);

    }
}
