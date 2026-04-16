import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        Scanner sc = new Scanner(System.in);

        //o nome de usúario tem q ser menor que 12 caracateres e maior que 4
        // não pode conter espaço

        String nome;

        System.out.print("Coloque o seu novo nome de úsuario: ");
        nome = sc.next();

        if (nome.length() <4 || nome.length() > 12){
            System.out.println("O nome de úsario tem que ter no minimo 4 e no maximo 12 caracteres.");

            else if (nome.contains(" ") || nome.contains("_")){
                System.out.println("O nome de úsuario não pode conter espaços ou underlines.");

            }

        } else {
            System.out.println("Olá!, " +nome);
            
        }
        sc.close();




    }
}
