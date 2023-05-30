public class Ex_1_1_15 {
    
    public static int[] histogram(int []a, int M) {

        int []result = new int[M];

        for (int i = 0; i < M; i++) 
        {
            int iCount = 0;
            for (int j = i; j < a.length; j++) 
            {
                if(a[j] == a[i])
                {
                    iCount++;
                }
            }
            result[i] = iCount;
        }

        return result;
    }

    public static void main(String[] args) {
        
        int []a = {1,2,3,4,5,6,6,9};
        int []result = histogram(a, 10);
        
        int iSum = 0;
        for (int i = 0; i < result.length; i++) 
        {
            iSum += result[i];
            System.out.print(result[i] + " ");
        }
        System.out.println();

        String SText = (iSum == a.length) ? "true" : "false";
        System.out.println(SText);
    }

}
