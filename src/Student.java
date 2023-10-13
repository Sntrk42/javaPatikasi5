public class Student {
    String name,stuNo;
    int classes;
    Course matExam;
    Course fizikExam;
    Course kimyaExam;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya, Course matExam,
            Course fizikExam, Course kimyaExam) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.matExam = matExam;
        this.fizikExam = fizikExam;
        this.kimyaExam = kimyaExam;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matExam, int fizikExam, int kimyaExam) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = (int) (mat * 0.8);
            this.matExam.note = (int) (matExam * 0.2);
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = (int) (fizik * 0.8);
            this.fizikExam.note = (int) (fizikExam * 0.2);
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = (int) (kimya * 0.8);
            this.fizikExam.note = (int) (kimyaExam * 0.2);
        }

    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (double) ((this.fizik.note + this.fizikExam.note)
                + (this.kimya.note + this.kimyaExam.note) + (this.mat.note + this.matExam.note)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " Sözlü notu: "  + this.matExam.note);
        System.out.println("Fizik Notu : " + this.fizik.note + " Sözlü notu: "  +this.fizikExam.note);
        System.out.println("Kimya Notu : " + this.kimya.note + " Sözlü notu: "  + this.kimyaExam.note);
    }

}