import java.util.*;

public class Ex1_1_5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入两个实数: ");
        double rValue1 = scan.nextDouble();
        double rValue2 = scan.nextDouble();

        if ((rValue1 > 0.0 && rValue1 < 1.0) && (rValue2 > 0.0 && rValue2 < 1.0)) 
        {
            System.out.println("true");
        } 
        else 
        {
            System.out.println("false");
        }

        scan.close();
        
    }

}
