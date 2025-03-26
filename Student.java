public class Student {
    String fname;
    String lname;
    String indexNumber;
    String email;
    String address;
    double[] grades = new double[20];
    int gradecount = 0;

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    void grades(double grade) {
        if (grade < 2.0 || grade > 5.0 || (grade *10) % 5 != 0)
        {
            throw new IllegalArgumentException("Grades must be between 2.0 and 5.0");
        }
        if (gradecount >= 20) {
            throw new IllegalArgumentException("Maksymalnie 20 ocen");
        }
        grades[gradecount++] = grade;
    }
    public double zaokraglaniesredniej() {
        if (gradecount == 0) {
            throw new IllegalArgumentException("Student nie ma żadnej oceny");
        }
        double sum = 0;
        for (int i = 0; i < gradecount; i++) {
            sum += grades[i];
        }
        double srednia = (Math.round((sum / gradecount)*2))/2.0;
        return srednia;
    }
}

