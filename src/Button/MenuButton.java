package Button;

import java.awt.*
;
import javax.swing.*;

//���� �г��� �޴� ��ư ���� �� ������
public class MenuButton extends JButton {
    
    public MenuButton(String text, Icon icon) {
    	super(text, icon);  //��ư�� �ؽ�Ʈ�� �̹��� ���� ���
    	super.setFont(new Font("���ʷҵ���", Font.BOLD, 15));
    	super.setForeground(new Color(102,051,000)); //��ư �۾����� ����
    	super.setBackground(new Color(255,204,204)); //��ư ������ ����
    	super.setBorderPainted(false); //��ư �׵θ� ����
    	super.setFocusPainted(false);  //��ư ���ý� ���� ���簢�� ����
    
    } 

}
