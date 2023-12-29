import java.util.Random;

public abstract class BattleLocation extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLocation(Player player, String name,Monster monster,String award ,int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNum = randomMonsterNumber();
        System.out.println("Tehlike : " + this.getName()) ;
        System.out.println("Dikkatli Ol! Burada " + monsterNum + " tane "+this.getMonster().getName() +" ile karşılaşacaksın!");
        System.out.println("Savaşmak için -S- , Kaçmak için -K-  : ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if(selectCase.equals("S")){
            System.out.println("Savaş İşlemi");
            //savaşma
        }
        return true;
    }

    public boolean combat(int monsterNum){
        for (int i = 1 ; i <= monsterNum ; i++ ){
            playerStats();
        }
            return false;
    }

    public void playerStats(){
        System.out.println("Oyuncu Değerleri ");
        System.out.println(" ---------------------- ");
        System.out.println("Can : " + this.getPlayer().getHealth() +
                " Hasar : " +getPlayer().getTotalDamage() +
                " Silah : " + this.getPlayer().getInventory().getWeapon().getName()+
                " Zırh  : " + this.getPlayer().getInventory().getArmor().getName()+
                " Blok  : " + this.getPlayer().getInventory().getArmor().getBlock() +
                " Para  : " + getPlayer().getMoney());

    }

    public void monsterStats(){
        System.out.println("Canavar Değerleri ");
        System.out.println(" ---------------------- ");
        System.out.println("Can : " + this.getPlayer().getHealth() +
                " Hasar : " +getPlayer().getTotalDamage() +
                " Silah : " + this.getPlayer().getInventory().getWeapon().getName()+
                " Zırh  : " + this.getPlayer().getInventory().getArmor().getName()+
                " Blok  : " + this.getPlayer().getInventory().getArmor().getBlock() +
                " Para  : " + getPlayer().getMoney());
    }


    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonster())+1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
