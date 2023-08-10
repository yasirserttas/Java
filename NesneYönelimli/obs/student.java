package NesneYönelimli;

public class student {
    course c1;
    course c2;
    course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    
    student(course c1, course c2,course c3,String name ,String stuNo,String classes){
        this.c1= c1;
        this.c2= c2;
        this.c3= c3;
        this.name= name;
        this.stuNo= stuNo;
        this.classes= classes;
        this.avarage=0.0;
        
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100)
        {
            this.c1.note=note1;
        }
        if(note2>=0 && note2<=100)
        {
            this.c2.note=note2;
        }
        if(note3>=0 && note3<=100)
        {
            this.c3.note=note3;
        }

         
        

        
        
    }
    void addBulkExamSozlu(int sozlu1,int sozlu2,int sozlu3){
        if(sozlu1>=0 && sozlu1<=100)
        {
            this.c1.sozlu=sozlu1;
        }
         if(sozlu2>=0 && sozlu2<=100)
        {
            this.c2.sozlu=sozlu2;
        } 
         if(sozlu3>=0 && sozlu3<=100)
        {

            this.c3.sozlu=sozlu3;

        }

    }   

   void printNote()
    {
        System.out.println(c1.name+"\tnotu: "+c1.note+"\nsozlu:  "+this.c1.sozlu);
        System.out.println(c2.name+"\tnotu: "+c2.note+"\nsozlu:  "+this.c2.sozlu);
        System.out.println(c3.name+"\tnotu: "+c3.note+"\nsozlu:  "+this.c3.sozlu);
    }

     void isPass(){
        
            this.avarage=(((this.c1.note+this.c2.note+this.c3.note)*(0.8)+(this.c1.sozlu+this.c2.sozlu+this.c3.sozlu)*(0.2))/3.0);
            if(this.avarage>=50){
                System.out.println("ismi:"+this.name+"\nnumarasi:"+this.stuNo+"\nsinifi:    "+this.classes);
                System.out.println("ortalamasi: "+this.avarage+"\n dersi basariyla gecti");
            }
            else{
                System.out.println("ismi:"+this.name+"\nnumarasi:"+this.stuNo+"\nsinifi:"+this.classes);
                System.out.println("ortalamasi:"+this.avarage+"\n dersden kaldiniz seneye insallah");
            }
            
        }
         
    
}
