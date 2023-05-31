package by.epam.jonline.Others;

public class Natural {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        
        int max_i = 1;
        int max_sum = 1;        

        for (int i = a; i <= b; i++) {
           
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            
            //если сумма делителей текущего  i  > max_sum, то max_sum = sum
            if (sum > max_sum){
                max_sum = sum;
                max_i = i;
            }
            
            
        }
        System.out.print(max_i + " " + max_sum);
        System.out.println();

    }
}
