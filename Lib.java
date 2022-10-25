import java.util.Scanner;
public class Lib{
    public static void main(String[] args) {
        String arr[]=new String[50];
        String arr2[]=new String[50];
        int id[] = new int[50];
        int price[]=new int[50];
        Lib enter = new Lib();
        enter.option(arr, arr2, id, price);
    }
    void option(String arr[], String arr2[], int id[], int price[]){
        System.out.println("**Welcome to the Student Library!**");
        System.out.println("   Please Select From The Following Options: ");
        System.out.println("***************");
        System.out.println("\n 1.add \n 2.search \n 3.delete \n 4.view");
        int option ;
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();
        Lib enter = new Lib();
        switch(option){
            case 1 :
            enter.add(arr , arr2, id, price);
            break;
            case 2 :
            enter.search(arr , arr2, id, price);
            break;
            case 3 :
            enter.delete(arr , arr2, id, price);
            break;
            case 4 :
            enter.view(arr , arr2, id, price);
            option(arr , arr2, id ,price);
            break;
            default:
            System.out.println("Invalid choice");
            break;
        }
        sc.close();
    }
    void add(String arr[] , String arr2[] , int id[] , int price[]){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<100;i++){
            if(arr[i] == null){
                System.out.println("Name of book : \t");
                arr[i]=sc.nextLine();
                System.out.println("Author Name of book : \t");
                arr2[i]=sc.nextLine();
                System.out.println("Id of book : \t");
                id[i]=sc.nextInt();
                System.out.println("Price of book : \t");
                price[i]=sc.nextInt();
                break;
            }
        }  
        option(arr ,arr2 ,id ,price);
        sc.close(); 
    }
    void search(String arr[] ,String arr2[] ,int id[] , int price[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you wanna search");
        String name[] = new String[50];
        name[0] = sc.nextLine();
        for(int i=0;i<50;i++){
            if(arr[i].equals(name[0])){
                System.out.println("Name = "+arr[i] + "\t Author name : "+arr2[i] + "\t Book id =" +id[i] + "\t Price ="+price[i] +"\n");
                break;
            }
        }
        option(arr , arr2 ,id , price);
        sc.close();
    }
    void delete(String arr[] ,String arr2[] ,int id[] , int price[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you wanna search");
        String name[] = new String[50];
        name[0] = sc.nextLine();
        for(int i=0;i<50;i++){
            if(arr[i].equals(name[0])){
                arr[i]=null;
                arr2[i]=null;
                id[i]=0;
                price[i]=0;
                System.out.println("Deleted successfully");
                break;
            }
        }
        option(arr , arr2 , id , price);
        sc.close();
    }
    void view(String arr[] , String arr2[] , int id[] , int price[]){
        for(int i=0 ; i<50;i++){
            if(arr[0]==null){
                System.out.println("No books");
                break;
            }else if(arr[i]!=null){
                System.out.println("Name = "+arr[i] + "\t Author name : " +arr2[i] + "\t Book id =" +id[i] + "\t Price ="+price[i] +"\n");
            }
        }
    }
}
