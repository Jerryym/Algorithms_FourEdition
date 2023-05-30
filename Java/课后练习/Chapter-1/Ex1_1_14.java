import java.util.*;

public class Ex1_1_14 {

    public static int lg(int N) {
        
        if (N < 1)  throw new RuntimeException();

        int iResult = 0;
        int iExp = 1;

        while (iExp <= N) {
            iExp *= 2;
            iResult++;
        }

        return iResult-1;
    }

    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个整数: ");
        int N = scan.nextInt();
        scan.close();

        int iResult = lg(N);
        String SText  = String.format("Result = %d", iResult);
        System.out.println(SText);

    }

}
