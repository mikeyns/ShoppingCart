import java.util.Scanner;

public class NameMaker {
    public static void main(String[] args) {
        // Crie um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declare variáveis de String: firstName, middleName, lastName e fullName
        String firstName, middleName, lastName, fullName;

        // Solicite que usuários insiram os respectivos nomes, nomes do meio e sobrenomes e leiam os nomes no teclado
        System.out.print("Digite seu primeiro nome: ");
        firstName = scanner.nextLine();

        System.out.print("Digite seu nome do meio: ");
        middleName = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        lastName = scanner.nextLine();

        // Defina e exiba fullName como firstName + espaço + middleName + espaço + lastName
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("O nome completo e: " + fullName);

        // Feche o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
