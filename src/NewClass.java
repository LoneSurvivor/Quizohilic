import java.awt.*; 
import java.applet.*; 
/*
<applet code="StatusWindow" width=300 height=50> 
</applet> 
*/ 
public class NewClass extends Applet { 
public void init() { 
setBackground(Color.cyan); 
} 
// Display msg in applet window. 
public void paint(Graphics g) { 
g.drawString("This is in the applet window.", 100, 20); 
showStatus("This is shown in the status window."); 
} 
} 