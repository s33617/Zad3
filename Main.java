public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Darek", "Darowski", "s33543", "s33543@gmail.com", "Warszawa");
        Student s2 = new Student("Arek", "Aarowski", "s33544", "s33544@gmail.com", "Warszawa");
        Student s3 = new Student("Larek", "Larowski", "s33545", "s33545@gmail.com", "Warszawa");

        Studentgroup grupa = new Studentgroup("Grupa 1");
        grupa.addStudent(s1);
        grupa.addStudent(s2);
        grupa.addStudent(s3);

        s1.grades(3);
        s1.grades(4.5);
        s1.grades(5);
        grupa.printStudentGroup();

        System.out.println("Średnia ocen studenta " + s1.indexNumber + ": " + s1.zaokraglaniesredniej());
    }
}
