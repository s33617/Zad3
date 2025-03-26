public class Studentgroup {
    String nazwa;
    Student[] students = new Student[15];
    int studentCount = 0;

    Studentgroup(String nazwa) {
        this.nazwa = nazwa;
    }
    void addStudent(Student student) {
        if (studentCount >= 15) {
            throw new IllegalStateException("Maksymalna liczba studentów w grupie wynosi 15");
        }
        for (int i = 0; i < studentCount; i++) {
            if (students[i].indexNumber == student.indexNumber) {
                throw new IllegalStateException("Student " + student.indexNumber + " już jest w tej grupie");
            }
        }
        students[studentCount++] = student;
    }
    public void printStudentGroup() {
        System.out.println("Grupa: " + nazwa);

    }
}
