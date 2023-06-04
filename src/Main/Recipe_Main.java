package Main;

import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

import Button.MenuButton;
import Button.KfoodItem;
import Button.JfoodItem;
import Button.CfoodItem;
import Button.WfoodItem;

import Action.PageMove;


public class Recipe_Main extends JFrame {
	
	//Ű���� �̺�Ʈ�� �ִ� item_panel�� �ִ� Item ���� �г�
	private static JPanel ItemBar = new JPanel(); 
	//recipe_panel�� �����Ǹ� ��� TextArea
	public static TextArea text_area = new TextArea("�޴��� Ŭ���Ͻÿ�.", 4,75, TextArea.SCROLLBARS_BOTH);
	
	public Recipe_Main() {
		
		Container c = getContentPane();
        
		//Ÿ��Ʋ �г�
        JPanel title_panel = new JPanel(); 
        title_panel.setPreferredSize(new Dimension(50,50)); //title_panel ũ�� ����
        title_panel.setBackground(Color.WHITE);
        
        ImageIcon timg = new ImageIcon("Image/����.png");
        JLabel tlogo = new JLabel(timg);      
        
		tlogo.setLocation(-150,-10);
		tlogo.setSize(700,100);
		
		title_panel.add(tlogo);

		//�޴� �г�
        JPanel menu_panel = new JPanel(); 
        menu_panel.setPreferredSize(new Dimension(150,600)); //menu_panel ũ�� ����
        menu_panel.setBackground(Color.WHITE);
        menu_panel.setLayout(new GridLayout(4,1,0,0));
		

		//������ �г�
		JPanel recipe_panel = new JPanel();
		recipe_panel.setPreferredSize(new Dimension(400,100));
		recipe_panel.setBackground(new Color(255,204,204));
		
		//������ �г�
		JPanel item_panel = new JPanel(); 
		
		//���ʿ� �ѽ�, �Ͻ�, �߽�, ��� �޴� ��ư ���� �� ����
		ImageIcon kicon = new ImageIcon("Image/menuicon/kmenu.png");
		ImageIcon jicon = new ImageIcon("Image/menuicon/jmenu.png");
		ImageIcon cicon = new ImageIcon("Image/menuicon/cmenu.png");
		ImageIcon wicon = new ImageIcon("Image/menuicon/wmenu.png");
	
		MenuButton kmenu = new MenuButton("�ѽ�", kicon);
		MenuButton jmenu = new MenuButton("�Ͻ�", jicon);
		MenuButton cmenu = new MenuButton("�߽�", cicon);
		MenuButton wmenu = new MenuButton("���", wicon);
		
		menu_panel.add(kmenu);
		menu_panel.add(jmenu);
		menu_panel.add(cmenu);
		menu_panel.add(wmenu);
		
		ItemBar.setPreferredSize(new Dimension(625,650));
		ItemBar.setLocation(0,0);
		ItemBar.setBackground(Color.WHITE);

		
		//�޴����� item_bar�� ��Ź
		KfoodItem korean = new KfoodItem();
		korean.setVisible(true); //���� �� �ѱ����� �޴����� ����
		
		
		JfoodItem japan = new JfoodItem();
		japan.setVisible(false);
		
		CfoodItem china = new CfoodItem();
		china.setVisible(false);
		
		WfoodItem western = new WfoodItem();
		western.setVisible(false);
		
		//ItemBar�� ������ �����۵� ����
		ItemBar.add(korean);
		ItemBar.add(japan);
		ItemBar.add(china);
		ItemBar.add(western);
		
		item_panel.add(ItemBar);
		item_panel.setBackground(new Color(255,204,204));
		item_panel.setSize(720,600);
		item_panel.setLocation(0,00);
		
		//c.add(item_panel, BorderLayout.CENTER);

		//menu_panel�� �޴����� ������ �ش� �����۵��� ���̵���
		kmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {         
				korean.setVisible(true);
				japan.setVisible(false);
				china.setVisible(false);
				western.setVisible(false);
			}
		});
		
		
		jmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    
				korean.setVisible(false);
				japan.setVisible(true);
				china.setVisible(false);
				western.setVisible(false);
			}
		});
		
		cmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {         
				korean.setVisible(false);
				japan.setVisible(false);
				china.setVisible(true);
				western.setVisible(false);
			}
		});
		
		wmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {         
				korean.setVisible(false);
				japan.setVisible(false);
				china.setVisible(false);
				western.setVisible(true);
			}
		});
		
		//������ �гο� �����Ǹ� ��� text_area ����
		recipe_panel.add(text_area, BorderLayout.CENTER);
	
		
		c.add(title_panel, BorderLayout.NORTH);
        c.add(menu_panel, BorderLayout.WEST);
        c.add(item_panel, BorderLayout.EAST);
		c.add(recipe_panel, BorderLayout.SOUTH);
		
		HomeFrame();

	}
	
	public void HomeFrame() {  //��ü �������� �⺻���� �޼ҵ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame�� �������� �ǵ���
		setTitle("���� ������ �丮 ������");  //Ÿ��Ʋ
		setSize(800, 500);  //�������� ũ��
		setVisible(true); //â�� ȭ�鿡 ���̵���
	}
	
	
	public static void main(String[] args) {
		new Recipe_Main();
		new PageMove(ItemBar);   //ȭ���̵� Ű���� �̺�Ʈ
	} 
}
