import java.awt.*;
import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;

public class Main {

    public static void main(String[] args) {

        Date relogio = new Date();
        Locale local = Locale.getDefault();
        Dimension tam = Toolkit.getDefaultToolkit().getScreenSize();

        int lar = (int) tam.getWidth();
        int alt = (int) tam.getHeight();

        System.out.println("=== Informações do Sistema ===");
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());

        System.out.print("\nA linguagem do sistema é: ");
        System.out.println(local.getDisplayLanguage());

        System.out.print("\nA Relução da sua tela é: ");
        System.out.println(lar + "x" + alt);
    }

}