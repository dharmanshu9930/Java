import java.util.*;
public class tempCodeRunnerFile {
String name, add, bg, staff, treatment; int age;
double bill = 0;
public void PatientDetails(){
Scanner sc = new Scanner(System.in); System.out.print("Enter your name - "); name = sc.nextLine(); System.out.print("Enter your age - "); age = sc.nextInt();
sc.nextLine();
System.out.print("Enter your address - "); add = sc.nextLine();
System.out.print("Enter your blood group - "); bg = sc.nextLine(); System.out.print("Assigned Staff - ");
staff = sc.nextLine(); System.out.print("Treatment - "); treatment = sc.nextLine();
};
public void ShowPatient(){ PatientDetails(); System.out.println("Name - " + name); System.out.println("Age - " + age); System.out.println("Address - " + add);
System.out.println("Blood group - " + bg); System.out.println("Assigned staff - " + staff); System.out.println("Treatment - " + treatment);
}
public void BloodNeed(){
if (bg.equalsIgnoreCase("O")){ bill += 2000;
} else if (bg.equalsIgnoreCase("A")){ bill += 2100;
} else if (bg.equalsIgnoreCase

