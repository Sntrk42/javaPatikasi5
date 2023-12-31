public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course matExam = new Course("Matematik", "MAT102", "MATE");
        Course fizikExam = new Course("Fizik", "FZK102", "FZKE");
        Course kimyaExam = new Course("Kimya", "KMY102", "KMYE");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya,
                matExam, fizikExam, kimyaExam);
        s1.addBulkExamNote(50,20,40, 30, 60, 72);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,
                matExam, fizikExam, kimyaExam);
        s2.addBulkExamNote(100,50,40, 80, 60, 40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,
                matExam, fizikExam, kimyaExam);
        s3.addBulkExamNote(50,20,40, 60, 80, 45);
        s3.isPass();

    }
}