package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        class Salary
        {
            int Sal = 40000;
        }
        class Bonus extends Salary
        {
            int total;
            int bonus=10000;
        }
        Bonus b= new Bonus();
        b.total=b.Sal+ b.bonus;
        System.out.println("total="+b.total);
    }
}
