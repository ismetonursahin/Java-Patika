public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Ahmet Hoca", "MAT", "545 85 654");
        Teacher teacher2 = new Teacher("Ali Hoca", "FZK", "532 68 455");
        Teacher teacher3 = new Teacher("Veli Hoca", "TRH", "132 78 425");

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.teacherAdd(teacher1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.teacherAdd(teacher2);

        Course tarih = new Course("Tarih", "103", "TRH");
        tarih.teacherAdd(teacher3);


        Student student1 = new Student("Hasan", "11", "1", matematik, fizik, tarih);
        student1.addBulkExamples(100, 50, 74);
        student1.isPass();

        Student student2 = new Student("Kemal","45","2",matematik,fizik,tarih);
        student2.addBulkExamples(45,23,63);
        student2.isPass();

    }
}
