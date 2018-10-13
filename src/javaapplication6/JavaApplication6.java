
package javaapplication6;
import java.util.Scanner;

public class JavaApplication6 {

    char c;
    
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Letter");
        char c=sc.next().charAt(0);
        
        if(c=='a'){
        System.out.println("Vowel");
        }
        else if(c=='e'){
        System.out.println("Vowel");
        }
        else if(c=='i'){
        System.out.println("Vowel");
        }
        else if(c=='o'){
        System.out.println("Vowel");
        }
        else if(c=='u'){
        System.out.println("Vowel");
        }
        else System.out.println("Consonent");
       
        
    }
    
}
