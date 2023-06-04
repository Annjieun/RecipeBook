package Action;
import java.awt.*;


import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PageMove extends JFrame{
	
	public PageMove(JPanel k){
 
		  this.addKeyListener(new KeyAdapter()
		  { 
		   public void keyPressed(KeyEvent e){
		    switch(e.getKeyCode()){
		     case KeyEvent.VK_UP:
		      k.setLocation(k.getX(), k.getY()-10);
		      break;
		     case KeyEvent.VK_DOWN:
		      k.setLocation(k.getX(), k.getY()+10);
		      break;
		      /* 화면 구성에 따라 오른쪽 왼쪽 키가 아닌 위 아래 키를 입력받도록 함.
		     case KeyEvent.VK_LEFT:
		      k.setLocation(k.getX()-10, k.getY());
		      break;
		     case KeyEvent.VK_RIGHT:
		      k.setLocation(k.getX()+10, k.getY());
		      break;
		      */
		    }
		  }
		 });
		  
   this.setVisible(true);  
	}

}