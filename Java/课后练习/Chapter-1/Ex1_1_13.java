public class Ex1_1_13 {
    
    public static void main(String[] args) {
        
        int M = 4;
        int N = 3;
        int [][] a = new int [M][N];
        for (int i = 0; i < M ; i++) 
        {
            for (int j = 0; j < N ; j++) 
            {
                a[i][j]=i+j;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [][] b = new int[N][M];
        for (int i = 0; i < N ; i++) 
        {
            for (int j = 0; j < M ; j++) 
            {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }

}
