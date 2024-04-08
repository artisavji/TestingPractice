package Generic;

public class GenericMethod {
    {
        class DemoClass{
            public <D> void genericsmethod( D data)
            {
                System.out.println("Generics Method:");
                System.out.println("Data passed: " +data);
            }
        }
    }
    public static void main(String[] args) {

    }
}

