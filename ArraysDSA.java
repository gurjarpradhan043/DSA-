public class ArraysDSA {
    public static void main(String[] args) {
        
        //making array 
        int[] marks = new int[5];

       //initilizing array
        marks[0] = 98;  
        marks[1] = 59;
        marks[2] = 99;
        marks[3] = 5;
        marks[4] = 48;

        //output 
        System.out.println("This is 0 index -> "+ marks[0]);
        System.out.println("This is 1 index -> "+ marks[1]);
        System.out.println("This is 2 index -> "+ marks[2]);
        System.out.println("This is 3 index -> "+ marks[3]);
        System.out.println("This is 4 index -> "+ marks[4]);
        System.out.println();


        //createing a line gape 
        System.out.println("This is made by loop");
        System.out.println();

        //output using loop
        for(int i = 0; i<=4; i++) {
            System.out.println("this is " + i + " index -> " + marks[i]);
        }
        
    }
}