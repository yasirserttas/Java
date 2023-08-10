package NesneYönelimli.obs.fabrika;

public class employee {
    String isim;
    double maas;
    int csaat;
    int basyili;

    employee(String isim,double maas,int csaat,int basyili){

        this.isim=isim;
        this.maas=maas;
        this.csaat=csaat;
        this.basyili=basyili;

    }

    double vergi(){
        if(maas>1000){
            return maas*0.03;

        }
        else{
            return 0;

        }

    }
    double bonus(){
        if(csaat>40){
           return   (csaat-40)*30;

        }
        else{
            return 0;
        }

    }

    double calismaSene(){
        if((2021-basyili)<10){
           return  maas*0.05;
        }
        else if((2021-basyili)>9 && 20>(2021-basyili)){
           return maas*0.1;

        }
        else{
            return maas*0.15;
        }
    }
    
}
