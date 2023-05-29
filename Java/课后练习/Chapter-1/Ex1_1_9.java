import java.util.*;

public class Ex1_1_9 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个正整数: ");
        int N = scan.nextInt();
        scan.close();

        String s = "";
        for (int i = N; i > 0; i /= 2) 
        {
            s = (i % 2) + s;    
        }
        
        System.out.println(s);
    }

}
