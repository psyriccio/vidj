package psyriccio.vidj;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;

public class Main {

    public static MainForm MAIN_FORM;

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Thread.currentThread().setName("UI");
            try {
                UIManager.setLookAndFeel(new SubstanceGraphiteLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            MAIN_FORM = new MainForm();
            MAIN_FORM.setVisible(true);
        });
    }
}
