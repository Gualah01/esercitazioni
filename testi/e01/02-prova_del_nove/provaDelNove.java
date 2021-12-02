import java.util.Scanner;

public class provaDelNove {
    public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Inserisci n: ");
            n = sc.nextInt();
            sc.close();
            n = SommaCifre(n);
            ProvaNove(n);
    }

    public static int SommaCifre(int x){
        if(x < 10) return x;
        else {
            int tot = 0;
            while (x >= 10){
                tot += x % 10;
                x /= 10;
            }
            tot += x % 10;
            return SommaCifre(tot);
        }
    }

    public static void ProvaNove(int n){
        for(int a = 0; a < n; a++){
            for(int b = 0; b < n; b++){
                for(int c = 0; c < n; c++){
                    if (a * b != c){
                        if (VerificaProva(a, b, c)){
                            System.out.printf("%d %d %d\n", a, b, c);
                        } 
                    }
                }
            }
        }
    }

    public static boolean VerificaProva(int a, int b, int c){
        return (SommaCifre(SommaCifre(a) * SommaCifre(b)) == SommaCifre(c));
    }
}