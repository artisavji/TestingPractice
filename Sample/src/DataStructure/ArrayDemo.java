package DataStructure;
public class ArrayDemo {
    public static void main(String[] args) {
        //Declares an array
        int intArray[];

        //initialize of an array of int
        //Set aside memory of 8 digit
        intArray = new int[8];

        System.out.println("Array before adding data");

        //display elements of an array with display method
        // display(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Adding " + i + " at index " + i);
            intArray[i] = i;
        }
        System.out.println();
        System.out.print("Array after adding data ");
        display(intArray);


        //Operation Insertion
        //Element of any location can be updated directly
        int index = 5;
        intArray[index] = 10;
        System.out.print("Array after updating element at index" +index);

        display(intArray);

        //Operation Search using Index search an element using index
        //System.out.println("Data at Index" +index+ ":" + intArray[index]);

        //Operation Search using value
        int value =4;
        for(int i=0;i<intArray.length;i++)
        {
            if(intArray[i]==value){
                System.out.println(value+ " found at index" +i);
                break;
            }

        }
        System.out.println("Data at Index" +index+ ":" +intArray[index]);

    }
    private static void display(int[] intArray){
        System.out.print("Array: [");
        for(int i = 0;i < intArray.length; i++)
        {
            //display the index of element i
            System.out.print("" +intArray[i]);
        }
        System.out.print("]");
        System.out.println();
    }
}
