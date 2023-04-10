import java.util.Scanner;
/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 09/04/2023   */

public class App {
    public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);

		System.out.print("Informe o tamanho do arquivo para download em MB:");
        double tamanho = s.nextDouble();

        System.out.print("Informe a velocidade do link em Mbps:");
        double velocidade = s.nextDouble();

        double tempo = tamanho / velocidade;
        double min = tempo/60;

        System.out.printf("O tempo aproximado de download do arquivo em minutos será de %.2f minutos.",min);

        s.close();


    }
}