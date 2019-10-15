
package Rsa;

import java.util.Scanner;

public class RsaMain {
     public static void main(String[] args) {
         int a,b;
         String ch,ch1;
        
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
         System.out.println("ENTER TEXT TO ENCRIPT:");
        ch=scan1.nextLine();
        RSA rsa=new RSA(a, b);
        rsa.generate();
        rsa.encripte(ch);
         System.out.println("ENTER TEXT TO DECRIPT:");
        ch1=scan1.nextLine();
        rsa.decripte(ch1);
    }
    
}
