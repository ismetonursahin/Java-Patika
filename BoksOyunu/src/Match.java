public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int maxWeight;
    int minWeight;

    Match(Fighter fighter1, Fighter fighter2, int maxWeight, int minWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;

    }

    void run(){
        if(isCheck()){
           while(this.fighter1.health > 0 && this.fighter2.health > 0){
               System.out.println("******  Yeni Round  ******");
             this.fighter2.health = this.fighter1.hit(fighter2);
             if(iswin()){
                 break;
             }
             this.fighter1.health = this.fighter2.hit(fighter1);
             if(iswin()){
                 break;
             }
               System.out.println(this.fighter1.name + " Sağlık : " + this.fighter1.health);
               System.out.println(this.fighter2.name + " Sağlık : " + this.fighter2.health);
           }
        }else {
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }

    boolean isCheck(){
        return (this.fighter1.weight <= maxWeight && this.fighter1.weight >= minWeight) && (this.fighter2.weight <= maxWeight && this.fighter2.weight >= minWeight );
    }

    boolean iswin(){
        if(this.fighter1.health == 0){
            System.out.println(this.fighter2.name +" Kazandı");
        return true;
        }

        if(this.fighter2.health == 0){
            System.out.println(this.fighter1.name+ " Kazandı");
          return true;
        }
        return  false;
    }

}
