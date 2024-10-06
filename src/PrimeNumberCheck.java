import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = isPrimeNumber(number);
        if (isPrime) {
            System.out.println("The Number " + number + " is a prime number");
        }
        else{
            System.out.println("The Number " + number + " is not a prime number");
        }
    }

    private static boolean isPrimeNumber(int number) {
        //handle the cases for number less than 2
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false; // If the number is divisible by i(means the number is divided by any number from 2), then the number is not a prime number.
                // As we know, prime number is the number which can divide by only 1 or that number.
            }
        }
        return true;
    }
}
