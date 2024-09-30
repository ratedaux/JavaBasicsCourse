package homework15;

public class Main {

    public static void main(String[] args) {

    Student student=new Student("Jane", 18, "cohort52.1",100);
    student.skipLectures();
    student.doHomework();

    Teacher teacher=new Teacher("John", "Java Basics");
    teacher.readLecture();
    teacher.checkHomework();

    Doctor doctor=new Doctor("Tom", "Surgeon", 2);
    doctor.inspectPatient();
    doctor.treatPatient();

    }
}
