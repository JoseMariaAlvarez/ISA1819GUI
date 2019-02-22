package ejercicioClase;
import java . awt . * ;
import java . awt . event . * ;
import javax . swing . * ;
public class ViewPanel extends JPanel implements WindowPanelWithExternalCtrl {
private JButton bY , bN ;
private JLabel l ;
public ViewPanel ( ) {
bY = new JButton("Yes") ;
bN = new JButton("NO") ;
l = new JLabel("True?") ;
add(l) ;
add(bY) ;
add(bN) ;
l.setBounds(20,20,20,20);
bY.setBounds(20,50,20,20);
bN.setBounds(20,80,20,20);

}
public void controller(ActionListener ctr) {
bY . addActionListener(ctr) ;
bY . setActionCommand(YES) ;
bN . addActionListener(ctr) ;
bN . setActionCommand(NO) ;
}
public void changeText(String s) {
l . setText(s) ;
}}
