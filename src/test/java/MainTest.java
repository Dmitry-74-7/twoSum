import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {

  @Test
  public void testTwoSumCorrect1() {
    int[] a = {1, -5, 9, 2, 0, 3, 6, 10};
    int sum = 4;
    int[] b = Main.twoSum(a, sum);
    int[] c ={0, 5};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
    assertEquals(a[b[0]] + a[b[1]], sum);
  }

  public void testTwoSumCorrect2() {
    int[] a = {1, -5, 9, 2, 0, 3, 6, 10};
    int sum = 9;
    int[] b = Main.twoSum(a, sum);
    int[] c ={2, 4};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
    assertEquals(a[b[0]] + a[b[1]], sum);
  }

  public void testTwoSumCorrect3() {
    int[] a = {1, -5, 9, 2, 0, 3, 6, 10};
    int sum = -3;
    int[] b = Main.twoSum(a, sum);
    int[] c ={1, 3};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
    assertEquals(a[b[0]] + a[b[1]], sum);
  }

  public void testTwoSumCorrect4() {
    int[] a = {1, -5, 9, 2, 0, 3, 6, 10};
    int sum = -5;
    int[] b = Main.twoSum(a, sum);
    int[] c ={1, 4};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
    assertEquals(a[b[0]] + a[b[1]], sum);
  }

  public void testTwoSumCorrect5() {
    int[] a = {1, -5, 9, 2, 0, 3, -6, 10};
    int sum = -11;
    int[] b = Main.twoSum(a, sum);
    int[] c ={1, 6};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
    assertEquals(a[b[0]] + a[b[1]], sum);
  }

  public void testTwoSumCorrect6() {
    int[] a = {1, 5, 9, 2, 0, 3, -6, 10};
    int sum = -1;
    int[] b = Main.twoSum(a, sum);
    int[] c ={1, 6};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
    assertEquals(a[b[0]] + a[b[1]], sum);
  }

  public void testTwoSumCorrectFail1() {
    int[] a = {1, 5, 9, 2, 0, 3, -6, 10};
    int sum = 100;
    int[] b = Main.twoSum(a, sum);
    int[] c ={0};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
  }

  public void testTwoSumCorrectFail2() {
    int[] a = {1, 5, 9, 2, 1, 3, -6, 10};
    int sum = 1;
    int[] b = Main.twoSum(a, sum);
    int[] c ={0};

    assertEquals(Arrays.toString(c), Arrays.toString(b));
  }
}