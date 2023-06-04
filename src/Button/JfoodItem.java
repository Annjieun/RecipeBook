package Button;

import java.awt.*;







import java.awt.event.*;
import javax.swing.*;
import Button.ItemButton;

import static Data.RecipeData.jrecipe;
import static Main.Recipe_Main.text_area;
import static Button.JfoodItem.Jcook;
import static Data.RecipeData.find_jname;
import static Data.RecipeData.jname;


//�Ͻ� �޴� ������ ��ư
public class JfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Jcook = new ItemButton[6];
	
	public JfoodItem()  {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));

		//�Ͻ� �޴��� ������ ��ư ����
		Jcook[0]= new ItemButton("���", "Image/�Ϻ�����/���.png");
		Jcook[1]= new ItemButton("Ÿ�ھ߳�", "Image/�Ϻ�����/Ÿ�ھ߳�.png");
		Jcook[2]= new ItemButton("���丶��", "Image/�Ϻ�����/���丶��.png");
		Jcook[3]= new ItemButton("�Ե�", "Image/�Ϻ�����/�Ե�.png");
		Jcook[4]= new ItemButton("����ư�", "Image/�Ϻ�����/����ư�.png");
		Jcook[5]= new ItemButton("�Ͻĸ��� ��õ", "Image/��õ.png");
		
		//�� ������(�丮)�� ������ �����ǰ� text_area�� �������� ������ ���
		for (i=0; i<Jcook.length-1; i++) {
			Jcook[i].addActionListener(new MyListener());
			add(Jcook[i]);
		
		}
		//Jcook[5] ��ư�� ������ ���ϴ� �߽ĸ޴��� ���� ���� ��õ
		Jcook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("���ϴ� ���� �޴�?");

            	switch(input) {
            	case "���" :
            		System.out.println("������Դϴ� ���ŵ� 485-11");
            		break;
            	case "Ÿ�ھ߳�" :
            		System.out.println("Ÿ�ھ�ŷ ���з� 43");
            		break;
            	case "���丶��" :
            		System.out.println("���� ȭ�絿 8-59");
            		break;
            	case "�Ե�" :
            		System.out.println("���õ� �޵� 873-7");
            		break;
            	case "����ư�" :
            		System.out.println("�ļ��� ��ȭ�� 477-12");
            		break;
            	}
            }
        });
		
		add(Jcook[5]);
	}
	
	
	class MyListener implements ActionListener{	
		String str = jrecipe.get(find_jname(i));
		
		@Override
		 public void actionPerformed(ActionEvent e) {
			 text_area.setText(str);
			
		 }
	}
	
}