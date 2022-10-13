import java.util.Scanner;
public class duplicate_char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String duplicate ="";
        for(int i = 0; i<input.length();i++){
            for(int j=i+1; j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                duplicate = duplicate + input.charAt(i);
            }
                
            }
        }
        System.out.println(duplicate);

    }
}
