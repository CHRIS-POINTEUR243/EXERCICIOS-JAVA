
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância de Locale para representar o idioma inglês nos Estados Unidos
        Locale usLocale = new Locale("en", "US");
        
        // Criar uma instância de Locale para representar o idioma francês na França
        Locale frLocale = new Locale("fr", "FR");
        
        // Imprimir informações sobre os Locales
        System.out.println("Locale dos Estados Unidos:");
        System.out.println("País: " + usLocale.getCountry());
        System.out.println("Idioma: " + usLocale.getLanguage());
        System.out.println("Display Name: " + usLocale.getDisplayName());
        
        System.out.println("\nLocale da França:");
        System.out.println("País: " + frLocale.getCountry());
        System.out.println("Idioma: " + frLocale.getLanguage());
        System.out.println("Display Name: " + frLocale.getDisplayName());
    }
}
