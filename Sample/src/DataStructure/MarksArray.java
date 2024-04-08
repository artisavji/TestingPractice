package DataStructure;

public class MarksArray {
    public static void main(String[] args) {
        //initialize array
        int [] marks= new int[4];
        //define array
        marks[0]=55;  //Sci
        marks[1]=65;  //Bio
        marks[2]=85;  //Math
        marks[3]=70;  //Eng
        // System.out.println(marks[0]);
        //System.out.println(marks[1]);
        // System.out.println(marks[2]);
        //System.out.println(marks[3]);//

        // with help of loop no need to use sout multiple times if we hv big data

        for (int i =0; i< 4; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
