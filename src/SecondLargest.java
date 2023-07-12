import java.util.Arrays;
import java.util.Scanner;
class Largest
{
    void find_val(int array[],int n)
    {
        int x=0;
        int max = array[n-1];
        if(n > 1) {
            for (int i = n - 1; i >= 0; i--) {
                if (array[i] < max) {
                    x=array[i];
                    break;
                }
            }
            System.out.println(x);
        }
        else {
            System.out.println("-1");
        }
    }
}
public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        Arrays.sort(array);
        Largest largest=new Largest();
        largest.find_val(array,n);
    }
}
