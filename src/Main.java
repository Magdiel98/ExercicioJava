import java.util.Scanner;
import com.lp2.Escola;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escola modelo = new Escola();

        System.out.print("Nome da escola: ");
        modelo.setNome(scanner.nextLine());

        System.out.print("Quantidade de funcionários: ");
        modelo.setFuncionarios(scanner.nextInt());

        System.out.print("Quantidade de estudantes: ");
        modelo.setEstudantes(scanner.nextInt());

        System.out.print("Quantidade de salas: ");
        modelo.getSala().setQuantSalas(scanner.nextInt());

        System.out.print("Quantidade de cadeiras: ");
        modelo.getSala().setCadeiras(scanner.nextInt());

        System.out.print("Quantidade de janelas: ");
        modelo.getSala().setJanelas(scanner.nextInt());

        System.out.println("\n\nCáculo do lucro da escola");
        System.out.print("Digite a entrada: ");
        double entrada = scanner.nextDouble();
        System.out.print("Digite a saída: ");
        double saida = scanner.nextDouble();
        System.out.print("Lucro: "+modelo.lucro(entrada, saida));








    }
}