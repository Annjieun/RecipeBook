package Button;

import java.awt.*;




import java.awt.event.*;
import javax.swing.*;
import Button.ItemButton;

import Data.RecipeData;

import static Data.RecipeData.krecipe;
import static Main.Recipe_Main.text_area;
import static Button.KfoodItem.Kcook;
import static Data.RecipeData.find_kname;
import static Data.RecipeData.kname;

//�ѽ� �޴� ������ ��ư
public class KfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Kcook = new ItemButton[6];
	
	public KfoodItem()  {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));
		
		//�ѽ� �޴��� ������ ��ư ����
		Kcook[0]= new ItemButton("��ġ�", "Image/�ѱ�����/��ġ�.png");
		Kcook[1]= new ItemButton("�����", "Image/�ѱ�����/�����.png");
		Kcook[2]= new ItemButton("û����", "Image/�ѱ�����/û����.png");
		Kcook[3]= new ItemButton("���κ��", "Image/�ѱ�����/���κ��.png");
		Kcook[4] = new ItemButton("�ᳪ����", "Image/�ѱ�����/�ᳪ����.png");
		Kcook[5] = new ItemButton("�ѽĸ��� ��õ", "Image/��õ.png");
		
		new RecipeData();  //�� �޴�(������)�� �����Ǹ� �޾��ش�.

		//�� ������(�丮)�� ������ �����ǰ� text_area�� �������� ������ ���
		for (i=0; i<Kcook.length-1; i++) {
			Kcook[i].addActionListener(new MyListener());
			add(Kcook[i]);
		}
		
		//Kcook[5] ��ư�� ������ ���ϴ� �߽ĸ޴��� ���� ���� ��õ
		Kcook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("���ϴ� ���� �޴�?");

            	switch(input) {
            	case "��ġ�" :
            		System.out.println("�ѿ�����ġ�� ����û�� ������ 702-12");
            		break;
            	case "�����" :
            		System.out.println("���⹫���� ��˱� 69-23");
            		break;
            	case "û����" :
            		System.out.println("�ֻ�û���� ���� 587-2");
            		break;
            	case "���κ��" :
            		System.out.println("��ȭ�����κ� ��ȭ�� 741-12");
            		break;
            	case "�ᳪ����" :
            		System.out.println("���־���ᳪ������ ���ŵ� 1533-5");
            		break;
            	}
            }
        });
		
		add(Kcook[5]);
	
	}

	
	class MyListener implements ActionListener{	
		String str = krecipe.get(find_kname(i));
		
		@Override
		 public void actionPerformed(ActionEvent e) {
			 text_area.setText(str);
			
		 }
	}
}

