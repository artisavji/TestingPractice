package ControlFlowStatement;
public class SumofNumber {
    public static void main(String[] args)
    {
        int i, n = 1234, sum = 0, rem;
        while (n!=0)
        {
            rem =n%10;
            sum=sum+rem;
            n=n/10;
        }
    }
}
