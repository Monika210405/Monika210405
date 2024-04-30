import java.awt.*;
import java.applet.*;

/*
<applet code="Applet.class" width="1000" height="1000"> </applet>
*/

@SuppressWarnings("removal")
public class Demo extends Applet {
	
	public void paint(Graphics g) {
		g.drawLine(10,10,100,200);
	}
}
