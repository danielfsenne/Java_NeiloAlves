import java.util.Locale;

public class Program {
    public static void main(String[] args){
        int y = 32;
        double x = 10.3764;
        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        Locale.setDefault(Locale.US);
        System.out.println(y);
        System.out.println(("Bom Dia"));
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
