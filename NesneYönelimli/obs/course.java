package NesneYönelimli;

 class course {
    String name;
    String code;
    String prefix;
    int note;
    teacher teacher;
    int sozlu;


    course(String name, String code,String prefix){
        this.name =name;
        this.code= code;
        this.prefix=prefix;
        
        int note=0;
        int sozlu=0;

    }

    void addTeacher(teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher= teacher;
            System.out.print("ogretmen ders uyumu olumlu.");  
        }
        else
        {
            System.out.print("ogretmen ve ders bolumleri uyusmuyor.");

        }
    }

    void printTeacher(){
        this.printTeacher();
    }
}
