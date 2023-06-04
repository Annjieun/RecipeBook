package Button;

import java.awt.*;


import java.awt.event.*;
import javax.swing.*;
import Button.ItemButton;

import static Data.RecipeData.crecipe;
import static Data.RecipeData.find_cname;
import static Main.Recipe_Main.text_area;
import static Button.CfoodItem.Ccook;
import static Data.RecipeData.cname;

//�߽� �޴� ������ ��ư
public class CfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Ccook = new ItemButton[6];
	
	public CfoodItem() {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));
		
		//�߽� �޴��� ������ ��ư ����
		Ccook[0]= new ItemButton("¥���", "Image/�߱�����/¥���.png");
		Ccook[1]= new ItemButton("«��", "Image/�߱�����/«��.png");
		Ccook[2]= new ItemButton("������", "Image/�߱�����/������.png");
		Ccook[3]= new ItemButton("���󼧱�", "Image/�߱�����/���󼧱�.png");
		Ccook[4]= new ItemButton("������", "Image/�߱�����/������.png");
		Ccook[5]= new ItemButton("�߽ĸ��� ��õ", "Image/��õ.png");
		
		//�� ������(�丮)�� ������ �����ǰ� text_area�� �������� ������ ���
		for (i=0; i<Ccook.length-1; i++) {
			Ccook[i].addActionListener(new MyListener());
			add(Ccook[i]);
		}
		//Ccook[5] ��ư�� ������ ���ϴ� �߽ĸ޴��� ���� ���� ��õ
		Ccook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("���ϴ� ���� �޴�?");

            	switch(input) {
            	case "¥���" :
            		System.out.println("õ��¥�� ���ŵ� 272-5");
            		break;
            	case "«��" :
            		System.out.println("ȭ«�� ���ŵ� 828-27");
            		break;
            	case "������" :
            		System.out.println("ȭ���� ������ 384-3");
            		break;
            	case "���󼧱�" :
            		System.out.println("�������� ��굿 1550-20");
            		break;
            	case "������" :
            		System.out.println("���� ���ŵ� 564-23");
            		break;
            	}
            }
        });
		
		add(Ccook[5]);
	}
	
	class MyListener implements ActionListener{	
		String str = crecipe.get(find_cname(i));
		
		@Override
		 public void actionPerformed(ActionEvent e) {
			 text_area.setText(str);
			
		 }
	}
}