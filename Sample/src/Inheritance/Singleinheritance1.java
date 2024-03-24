package Inheritance;

public class Singleinheritance1 {
    public static void main(String[] args) {
        class grandfather
        {
        String Property= "Land";
        }
        class father extends grandfather
        {
            String son;
            String Investment="Gold";

        }
        father f=new father();
        f.son=f.Property+ " "+f.Investment;
        System.out.println("son="+ " "+f.son);
    }
}
