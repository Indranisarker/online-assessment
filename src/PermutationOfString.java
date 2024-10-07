import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        List<String> permutations = new ArrayList<>();
        char[] string = word.toCharArray();

        permute(string, 0, string.length - 1, permutations);
        System.out.println(permutations);
    }

    private static void permute(char[] string, int i, int j, List<String> permutations) {
            if(i == j){
                permutations.add(String.valueOf(string));
            }
            else{
                for(int k = i; k <= j; k++){
                    swapCharacters(string,i,k);
                    permute(string,i+1,j,permutations);
                    swapCharacters(string,i,k);
                }
            }
    }

    private static void swapCharacters(char[] string, int i, int j) {
        char temp = string[i];
        string[i] = string[j];
        string[j] = temp;
    }
}
