import java.util.Scanner;

class ForSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        
        for (int i=0; i <= numbers; i++) {
            System.out.println(i);
        }
    }
}
