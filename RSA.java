
package Rsa;
import java.util.Scanner;
public class RSA {
 public int   num1,num2,n,e=0,d;
 public String ch;
 public char ch5,ch4;
 
 RSA(int num1, int num2, String ch ){
   this.num1 = num1;
   this.num2 = num2;
   this.ch = ch;
 }
 
  void generate(){
     int p,q,f,i,j,fl=1;
     p=num1;
     q=num2;
     n=p*q;
     f=(p-1)*(q-1);
     for(i=2;i<f;i++){
         if( n%i!=0 && f%i!=0 ){
             for( j=i-1 ; j>1 ; j-- ){
                 if(i%j==0)
                 {
                     fl=0;
                     break;
                 }
             }
             if(fl==0)
             {
                 fl=1;
                 continue;
             }
             e=i;
             break;
         }
     }
     for(i=2;;i++){
         if(((i*e)%f)==1){
          d=i;
          break;
         }
     }
 }
  
 void encripte(){
     String ch1 = ch;
     int i;
     for(i=0;i<ch.length();i++){
         ch5=ch.charAt(i);
         if(ch5=='\0'){break;}
     long a=(long) Math.pow(ch5-64, e);
     a=(a%n)+64;
      ch4=(char)a;
         System.out.print(ch4);
     }
 }
 
 void decripte(){
     String ch1 = ch;
     int i;
     for(i=0;i<ch.length();i++){
         ch5=ch.charAt(i);
         if(ch5=='\0'){System.out.println("nb");break;}
     long a=(long) Math.pow(ch5-64, d);
     a=(a%n)+64;
      ch4=(char)a;
         System.out.print(ch4);
     }
 }

}

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
