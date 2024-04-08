package Variables;

public class Person {
    private String name="Arti";
    private int age=12 ;
    public Person (String name,int age)
    {
        this.name=name;
        this.age=age;
            }
            public void displaydetails()
            {
                System.out.println("name:"+this.name);
                System.out.println("age:"+this.age);
            }

    public static void main(String[] args) {
        Person p1=new Person("Arti",12);
        System.out.println("Details Of person 1 :");
        p1.displaydetails();
        System.out.println();

        Person p2=new Person("Shilpa",10);
        System.out.println("Details of person 2");
        p2.displaydetails();
        System.out.println();

        Person p3=new Person("Ashu",8);
        System.out.println("Details of person 3");
        p3.displaydetails();
    }
}
