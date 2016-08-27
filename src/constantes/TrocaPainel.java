
package constantes;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vinícius Fernandes
 */
public class TrocaPainel {
    
    public static void mudarPainel(JPanel painelPai, String nameCard) {
        CardLayout layout = (CardLayout) painelPai.getLayout();
        layout.show(painelPai, nameCard);
    }  
}
