package Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        Grapes g= new Grapes();
        g.taste();
        g.eat();
        g.color();


    }

}

class Fruit {
    void eat() {
        System.out.println("everyone eat fruit");

    }
}

class Mango extends Fruit {
    void taste() {
        System.out.println("Mango is very sweet in taste");
    }
}

class Grapes extends Mango {
    void color () {
        System.out.println("grapes color is green");
    }

}
