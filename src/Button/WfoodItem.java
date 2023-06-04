package Button;

import java.awt.*;








import java.awt.event.*;
import javax.swing.*;
import Button.ItemButton;


import static Data.RecipeData.wrecipe;
import static Main.Recipe_Main.text_area;
import static Button.WfoodItem.Wcook;
import static Data.RecipeData.find_wname;
import static Data.RecipeData.wname;

//��� �޴� ������ ��ư
public class WfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Wcook = new ItemButton[6];
	
	public WfoodItem()  {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));
		
		//��� �޴��� ������ ��ư ����
		Wcook[0]= new ItemButton("����", "Image/��������/����.png");
		Wcook[1]= new ItemButton("�Ľ�Ÿ", "Image/��������/�Ľ�Ÿ.png");
		Wcook[2]= new ItemButton("����", "Image/��������/����.png");
		Wcook[3]= new ItemButton("������", "Image/��������/������.png");
		Wcook[4]= new ItemButton("�ܹ���", "Image/��������/�ܹ���.png");
		Wcook[5]= new ItemButton("��ĸ��� ��õ", "Image/��õ.png");
		
		//�� ������(�丮)�� ������ �����ǰ� text_area�� �������� ������ ���
		for (i=0; i<Wcook.length-1; i++) {
			Wcook[i].addActionListener(new MyListener());
			add(Wcook[i]);
		}
		
		//Wcook[5] ��ư�� ������ ���ϴ� �߽ĸ޴��� ���� ���� ��õ
		Wcook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("���ϴ� ���� �޴�?");

            	switch(input) {
            	case "����" :
            		System.out.println("��Ʈ������ ���ŵ� 849-11");
            		break;
            	case "�Ľ�Ÿ" :
            		System.out.println("�Ľ�Ÿ�ο��� ���ŵ� 630-10");
            		break;
            	case "����" :
            		System.out.println("������� ���ŵ� 630-18");
            		break;
            	case "������" :
            		System.out.println("�׸������������ ������ 437-7");
            		break;
            	case "�ܹ���" :
            		System.out.println("�������� ��굿 1499-3");
            		break;
            	}
            }
        });
		
		add(Wcook[5]);
	
	}
	
	class MyListener implements ActionListener{	
		String str = wrecipe.get(find_wname(i));
		
		@Override
		 public void actionPerformed(ActionEvent e) {
			 text_area.setText(str);
			
		 }
	}
}