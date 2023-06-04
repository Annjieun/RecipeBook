package Button;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

//각 아이템의 버튼을 만들어주고 디자인한다.
public class ItemButton extends JButton {
	
	private String name;
	
	public ItemButton(String name, String img) {

	
		ImageIcon icon = new ImageIcon(img);
		Image image = icon.getImage();
		
		//버튼에 달 이미지 등록과 크기 설정
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

