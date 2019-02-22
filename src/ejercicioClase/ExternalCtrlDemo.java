package ejercicioClase;
import javax . swing . JFrame ;
import javax . swing . SwingUtilities ;
public class ExternalCtrlDemo {
public static void main(String [ ] args) {
ViewPanel winPanel = new ViewPanel ( ) ;
ExternalCtrl bt = new ExternalCtrl(winPanel) ;
winPanel . controller(bt) ;
JFrame mainWin = new JFrame("An external control example") ;
SwingUtilities . invokeLater(new Runnable ( ) {
public void run ( ) {
createAndShowGUI ( ) ;
}
private void createAndShowGUI ( ) {
mainWin . setDefaultCloseOperation(JFrame . EXIT_ON_CLOSE) ;
mainWin . setContentPane(winPanel) ;
mainWin . pack ( ) ;
mainWin . setVisible(true) ;
}
} ) ;
}
}