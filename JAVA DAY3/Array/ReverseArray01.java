class ReverseArray01{ 
   
static int row = 3; 
static int column = 3; 

static void reverseArray(int arr[][]) 
{ 

    for (int i = 0; i < row; i++) { 
   
        int start = 0; 
        int end = column - 1; 

        while (start < end) { 

            int temp = arr[i][start]; 
            arr[i][start] = arr[i][end]; 
            arr[i][end] = temp; 
   
            start++; 
            end--; 
        } 
    } 
   

    for (int i = 0; i <row; i++) { 
        for (int j = 0; j <column; j++) { 
            System.out.print(arr[i][j] + " "); 
        } 
        System.out.println(); 
    } 
} 
   
public static void main(String[] args) 
{ 
    int arr[][] = { { 1, 2, 3 }, 
                     { 4, 5, 6 }, 
                     { 7, 8, 9 } }; 
   
   
    reverseArray(arr); 
} 
}