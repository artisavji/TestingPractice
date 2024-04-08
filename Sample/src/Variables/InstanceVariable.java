package Variables;

public class InstanceVariable {
    public String name;
    public int age;
    public int grade;
    void Firststd() {
        name="Arti";
        age=6;
        grade=1;
        System.out.println(name+ " "+age+ " "+ grade);
    }
    void Secondstd(){
        name="Shivani";
        age=7;
        grade=2;
        System.out.println(name+ " "+age+ " "+ grade);

    }
    public static void main(String[] args) {
       InstanceVariable student =new InstanceVariable();
        student.Firststd();
        student.Secondstd();
    }


}
