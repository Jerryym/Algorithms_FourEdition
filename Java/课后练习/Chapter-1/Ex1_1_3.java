import java.util.Scanner;   

public class Ex1_1_3 
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        int[] Numbers = new int[3];

        //接受用户的输入
        String SText;
        for (int i = 0; i < 3; i++) 
        {
            SText = String.format("输入第%d个整数: ", i+1);
            System.out.println(SText);
            Numbers[i] = scan.nextInt();
        }
       
        if (Numbers[0] == Numbers[1] && Numbers[0] == Numbers[2]) 
            System.out.println("Equal!");
        else 
            System.out.println("Not Equal!");
        
        //对象关闭
        scan.close();
    }
}

