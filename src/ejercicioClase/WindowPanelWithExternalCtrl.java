package ejercicioClase;
import java . awt . event . ActionListener ;
public interface WindowPanelWithExternalCtrl {
public static String YES = "Yes" ;
public static String NO = "No" ;
public void controller(ActionListener ctr) ;
public void changeText(String s) ;
}
