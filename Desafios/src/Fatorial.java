import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        //complete o código com sua solução
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer f = 1;
        if(n>0 && n<13) {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.println(f);
        }else{
            System.out.println("Informe um número maior que 0 e menor que 13");
        }
        sc.close();
    }
}
