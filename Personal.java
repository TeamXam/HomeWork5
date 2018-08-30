/**
 * Java 1. Home work 5
 *
 * @author ToBapuW
 * @version dated August 30, 2018
 */
public class Personal {
    public static void main(String[] args) {
        Cooperator[] cooperators = {
                new Cooperator("Ivan Nikolaevich Tjagnibok", "Manager" , "ivan@suxx.com", 17500,
                        22312, 39),
                new Cooperator("Nikolay Nikolaevich Zvyagincev", "Trader" , "kNiolay@suxx.com", 18800,
                        222222, 35),
                new Cooperator("Igor Nikanorovich Blok", "Mechanic" , "blok@suxx.com", 39000,
                        31345, 42),
                new Cooperator("Yorgen Anjeevich Rassinskiy", "Curier" , "yourgen@suxx.com", 11500,
                        2232, 41),
                new Cooperator("Ivan Mikhailovich Shevchenko", "Cook" , "ivan2@suxx.com", 19000,
                        33201, 39)
        };

        for (Cooperator cooperator : cooperators)
            if(cooperator.getAge()>40)
                System.out.println(cooperator);

    }
}


class Cooperator {
    String name;
    String post;
    String eMail;
    int profit;
    int phone;
    int age;

    public Cooperator(String name, String post, String eMail, int profit, int phone, int age){
        this.name = name;
        this .post = post;
        this.eMail = eMail;
        this.profit = profit;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}