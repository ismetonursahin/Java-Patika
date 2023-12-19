
public class Teacher {
    String name ;
    String branch;
    String phone;

   Teacher (String name,String branch,String phone) {
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }
    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Branş : " + this.branch);
        System.out.println("Telefon : " + this.phone);

    }

}