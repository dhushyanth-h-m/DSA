import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args){
        
    //Static arrays
    int numbers[] = new int[6];
    for(int i = 0; i < 11; i++){
        if(i%2 == 0){
            numbers[i/2] = i; 
        }
    }

    System.out.print("1D static array: ");
    for(int i:numbers){
        System.out.print(i+" "); //outputs all the elements in a single row
    }

    //multi-dimensional arrays
    int[][] rectangularArray = new int[4][2]; //rectangular array: Arrays with equal-length rows

    for(int i = 0; i < 4; i ++){
        for(int j = 0; j < 2; j++){
            rectangularArray[i][j] = i+j; //outputs elements in a row for every row that's available
        }
    }

    System.out.println("\n\n2D multi-dimensional array, ");
    for(int i[]: rectangularArray){
        for(int j: i){
            System.out.print(j+ " "); 
        }
        System.out.println();
    }
    
    int[][] jaggedArray = new int[4][]; //jagged array: Arrays where each row can hava a different length
    
    jaggedArray[0] = new int[]{23, 45,56,23};
    jaggedArray[1] = new int[]{87, 24};
    jaggedArray[2] = new int[]{56, 243,2, 243, 54, 67};
    jaggedArray[3] = new int[]{34,56,4};
    
    
    System.out.println("\nJagged multi-dimensional array, ");
    for(int i[]:jaggedArray){
        for(int j: i){
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //Dynamic arrays
    ArrayList<Integer> arrayList = new ArrayList<Integer>(); //Provides dynamic resizing capability
    arrayList.add(233); //[233]
    arrayList.add(54); //[233, 54]
    arrayList.add(6543); //[233, 54, 6543]

    System.out.println("\nDynamic array");
    System.out.println(arrayList);
    
    //Arrays with varargs
    System.out.println("\nArray with variable arguments"); //Allows variable number of arguments to a method as an array
    varargsArray(43, 54,56, 67, 234, 243); //[43, 54,56, 67, 234, 243]
    varargsArray(34, 54, 56); //[34,54,56]
    varargsArray(23,56,65,34, 43); //[23,56,65,34,43]
}
    public static void varargsArray(int... numbers){
        System.out.print("Length of the array: "+numbers.length+"; Elements: ");
        for(int num: numbers){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
