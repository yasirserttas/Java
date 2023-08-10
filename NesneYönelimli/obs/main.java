package NesneYönelimli;

public class main {
    public static void main(String[] args) {
        teacher t1= new teacher("Fatih hoca","444" , "MAT");
        teacher t2= new teacher("Halit hoca","234" , "BIO");
        teacher t3= new teacher("Raziye hoca", "111", "TUR");
        
        System.out.print("\n-------------------------------------------------\n");
        

        course tur= new course("Turkce", "101", "TUR");
        tur.addTeacher(t3);
        System.out.print("\n-------------------------------------------------\n");
        course mat= new course("Matematik", "102", "MAT");
        mat.addTeacher(t1);
        System.out.print("\n-------------------------------------------------\n");
        course bio= new course("Biyoloji", "103", "BIO");
        bio.addTeacher(t2);
        System.out.print("\n-------------------------------------------------\n");


        student s1 = new student(tur, mat, bio, "ahmet ", "3", "1");
        s1.addBulkExamNote(75,65,55);
        s1.addBulkExamSozlu(50,65,15);
        s1.printNote();
        s1.isPass();

        System.out.print("\n-------------------------------------------------\n");
        student s2 = new student(tur, mat, bio, "veysel ", "5", "1");
        student s3 = new student(tur, mat, bio, "yasir ", "6", "1");
        

        

        
    }
}
