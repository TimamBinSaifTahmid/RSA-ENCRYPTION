package Rsa;

public class RSA {

    public int num1, num2, n, e = 0, d;
    public char ch5, ch4;

    RSA(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void generate() {
        int p, q, f, i, j, fl = 1;
        p = num1;
        q = num2;
        n = p * q;
        f = (p - 1) * (q - 1);
        for (i = 2; i < f; i++) {
            if (n % i != 0 && f % i != 0) {
                for (j = i - 1; j > 1; j--) {
                    if (i % j == 0) {
                        fl = 0;
                        break;
                    }
                }
                if (fl == 0) {
                    fl = 1;
                    continue;
                }
                e = i;
                break;
            }
        }
        for (i = 2;; i++) {
            if (((i * e) % f) == 1) {
                d = i;
                break;
            }
        }
    }

    void encripte(String ch) {
        int i;
        for (i = 0; i < ch.length(); i++) {
            ch5 = ch.charAt(i);
            if (ch5 >= 65 && ch5 <= 90) {
                long a = (long) Math.pow(ch5 - 64, e);
                a = (a % n) + 64;
                ch4 = (char) a;
                System.out.print(ch4);
            }
            else {
                long a = (long) Math.pow(ch5 - 96, e);
                a = (a % n) + 96;
                ch4 = (char) a;
                System.out.print(ch4);
            }
        }
        System.out.print("\n");
    }

    void decripte(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            ch5 = str.charAt(i);
            if (ch5 >= 65 && ch5 <= 90) {
                long a = (long) Math.pow(ch5 - 64, d);
                a = (a % n) + 64;
                ch4 = (char) a;
                System.out.print(ch4);
            } 
            else {
                long a = (long) Math.pow(ch5 - 96, d);
                a = (a % n) + 96;
                ch4 = (char) a;
                System.out.print(ch4);
            }
        }
    }

}

