import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> loginUser = new HashMap<>();
        loginUser.put("marcelo@gmail.com", "Mpx13$mfd");
        Scanner scan = new Scanner(System.in);

        System.out.println("EMAIL: ");
        String email = scan.next();

        System.out.println("SENHA: ");
        String senha = scan.next();
        while ((!loginUser.containsKey(email)) || (!loginUser.containsValue(senha))){
            System.out.println("EMAIL OU SENHA INVALIDO, Tente novamente.");

            System.out.println("EMAIL: ");
            email = scan.next();

            System.out.println("SENHA: ");
            senha = scan.next();
        }

        System.out.println("LOGIN EFETUADO COM SUCESSO");
        System.out.println("*SISTEMA RODANDO*");
    }
}
