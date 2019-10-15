
package Rsa;

import java.util.Scanner;

public class RsaMain {
     public static void main(String[] args) {
         int a,b;
         String ch;
        
        Scanner scan=new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        ch=scan1.nextLine();
        RSA rsa=new RSA(a, b, ch);
        rsa.generate();
        rsa.encripte();
    
    }
    
}
