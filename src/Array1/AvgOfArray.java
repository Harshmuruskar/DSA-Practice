package Array1;

public class AvgOfArray {
    static double getAverage(int[] arr) {
        double sum=0;
      for(int i: arr ){
          sum+=i;
      }
      double avg = sum/arr.length;
      return avg;
    }
    static void main() {
        int arr [] = {2,4,1,3};
        System.out.println(getAverage(arr));
    }
}
