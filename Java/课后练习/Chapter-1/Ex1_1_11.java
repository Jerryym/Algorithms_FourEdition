//arr.length: 表示数组的行数
//arr[0].length: 表示对应行的长度

public class Ex1_1_11 {
    
    public static void main(String[] args) {
        
        boolean [][]arr = {
            {true, true, false},
            {true, false, true},
            {false, true, true}
        };

        System.out.print("  ");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(i + 1 + " ");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
