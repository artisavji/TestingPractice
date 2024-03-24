package ControlFlowStatement;


import java.util.Scanner;

public class switchcaseuse {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in)  ;
        System.out.println("Enter first number");
        int num1 = s.nextInt();
        System.out.println("Enter second number");
        int num2=s.nextInt();
        System.out.println("select symbol(+,-,*,%)");
        String sym=s.next();
        int Result;
       switch (sym)
        {
            case "+":Result=num1+num2;
                System.out.println("Addition is :"+Result);
                break;
            case "-":Result=num1-num2;
                System.out.println("Substraction is :"+Result);
            case "*":Result=num1*num2;
                System.out.println("Multiplication is :"+Result);
            case "%":Result=num1%num2;
                System.out.println("Division is:"+Result);
            default:
                System.out.println("invalid symbol");
                break;

        }

    }

}

