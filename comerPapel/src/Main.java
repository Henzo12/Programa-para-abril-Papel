//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            File imageFile = new File("C:\\Users\\Senai\\Downloads\\images.jpg");
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                Desktop.getDesktop().open(imageFile);

            }
            else {
                System.out.println("Não vai dar pra comerpapel");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }
}