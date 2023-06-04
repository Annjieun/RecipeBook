package Button;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

//�� �������� ��ư�� ������ְ� �������Ѵ�.
public class ItemButton extends JButton {
	
	private String name;
	
	public ItemButton(String name, String img) {

	
		ImageIcon icon = new ImageIcon(img);
		Image image = icon.getImage();
		
		//��ư�� �� �̹��� ��ϰ� ũ�� ����
		Image changeImg = image.getScaledInstance(300, 150, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel imgLabel = new JLabel(changeIcon);
	
		add(imgLabel);
		
		LineBorder lb = new LineBorder(new Color(255,204,204),3);
		TitledBorder tb = new TitledBorder(name);
		
		setSize(200,200);
		setBackground(Color.WHITE);
		setBorder(new CompoundBorder(lb,tb));
		setVisible(true);
		
		}

}

