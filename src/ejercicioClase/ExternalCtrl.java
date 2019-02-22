package ejercicioClase;
import java . awt . event . ActionEvent ;
import java . awt . event . ActionListener ;
public class ExternalCtrl implements ActionListener {
WindowPanelWithExternalCtrl win ;
public ExternalCtrl(WindowPanelWithExternalCtrl w) {
win = w ;
}
public void actionPerformed(ActionEvent e) {
String command = e . getActionCommand ( ) ;
if (command == WindowPanelWithExternalCtrl . YES)
win . changeText("Pressed Yes") ;
else if (command == WindowPanelWithExternalCtrl . NO)
win . changeText("Pressed No") ;
}
}