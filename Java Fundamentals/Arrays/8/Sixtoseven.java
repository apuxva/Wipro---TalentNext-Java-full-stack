/*If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum. */
public class Sixtoseven {
    public static void main(String[] args) {
        int[] n = {1,2,6,5,4,7,1};
        int sum = 0;
        outer:
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 6) {
                for (int j = i + 1; j < n.length; j++) {
                    if (n[j] == 7) {
                        i = j;
                        continue outer;
                    }
                }
            }
            sum += n[i];
        }
    
        System.out.println(sum);
        
    }
}
