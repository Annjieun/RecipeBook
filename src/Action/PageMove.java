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
		      /* ȭ�� ������ ���� ������ ���� Ű�� �ƴ� �� �Ʒ� Ű�� �Է¹޵��� ��.
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