import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = new Locale("pt", "PT");
        System.out.println("Seu sistema está em " + idioma.getDisplayLanguage());
    }
}
