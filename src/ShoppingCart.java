public class ShoppingCart {
    public static void main(String[] args) {
        // Suponha que custName seja uma String definida anteriormente
        String custName = "John Doe";

        // Use o método indexOf para obter o índice do caractere de espaço (" ") dentro de custName
        int spaceIdx = custName.indexOf(" ");

        // Atribua-o a spaceIdx
        // Use o método da substring e spaceIdx para obter a parte do primeiro nome de custName
        String firstName = custName.substring(0, spaceIdx);

        // Atribua-o a firstName e imprima firstName
        System.out.println("O primeiro nome e: " + firstName);
    }
}
