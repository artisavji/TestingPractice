package Generic;

public class GenericClass {
    public static void main(String[] args) {
        Mygen<String> m=new Mygen<>();
        m.add("Arti");
        System.out.println(m.getDatabase());

    }
}
