public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221;
        int reversedNum =0;
        reversedNum =  getReversedNumber(number,reversedNum);

        if(reversedNum == number){
            System.out.println("It's a palindrome number");
        }else{
            System.out.println("It's not a palindrome number");
        }

    }

    public static int getReversedNumber(int num, int rev){
        int remainder;
        if(num == 0){
            return  rev;
        }
        remainder = num % 10;
        rev = rev*10 + remainder;
        num = num / 10;
        return getReversedNumber(num,rev);
    }
}
