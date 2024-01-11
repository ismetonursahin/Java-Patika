import java.util.Iterator;
import java.util.TreeSet;

public class Brand {
    public void brand() {
        TreeSet<String> brand = new TreeSet<>();
        brand.add("Samsung");
        brand.add("Lenovo");
        brand.add("Apple");
        brand.add("Huawei");
        brand.add("Casper");
        brand.add("Asus");
        brand.add("HP");
        brand.add("Monster");

        for (String marka : brand){
            System.out.println(marka);
        }


    }

}
