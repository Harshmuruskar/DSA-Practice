package Arrays;

//2d array with dynamic column is called jacked array

public class TwoDIteration {
    static void main() {
        int [] [] arr ={
                {1,2},
                {2,3,4,5},
                {3,4,4,5,6,7},
                {4}
        };
        int rowlength = arr.length;
        for(int i=0 ; i<=rowlength-1; i++){
            int collength = arr[i].length;
            for (int j=0 ; j<=collength-1; j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
    }
}
