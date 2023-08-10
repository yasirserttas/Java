package NesneYönelimli;

 class teacher {
    String name;
    String mpno;
    String branch;

    teacher(String name, String mpno,String branch)
    {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print()
    {
            System.out.println("adi:"+this.name);
            System.out.println("telefon no::"+this.mpno);
            System.out.println("bolumu:"+this.branch);

    }



    
}
