public class Main {

  public static void main(String[] args) {

  }
  public static int[] twoSum(int[] nums, int sum) {
    int[] A = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i +1; j < nums.length; j ++) {
        if (nums[i] + nums[j] == sum) {
          A[0] = i;
          A[1] = j ;
          return A;
        }
      }
    }
    return new int[1];
  }

}
