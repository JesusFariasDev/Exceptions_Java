
import java.util.Locale;
import java.util.Scanner;
//finally serve para dizer para o código seguir mesmo com exceções
public class FormatadorCep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu CEP");
        String cepInformado = scanner.next();
        try {
            String cepFormatado = formatarCep(cepInformado);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
            System.out.println("Digite um CEP válido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //confirmação no console
        return "CEP válido";
    }


}

