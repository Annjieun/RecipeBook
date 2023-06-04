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
	
	//키보드 이벤트가 있는 item_panel에 있는 Item 부착 패널
	private static JPanel ItemBar = new JPanel(); 
	//recipe_panel에 레시피를 띄울 TextArea
	public static TextArea text_area = new TextArea("메뉴를 클릭하시오.", 4,75, TextArea.SCROLLBARS_BOTH);
	
	public Recipe_Main() {
		
		Container c = getContentPane();
        
		//타이틀 패널
        JPanel title_panel = new JPanel(); 
        title_panel.setPreferredSize(new Dimension(50,50)); //title_panel 크기 조절
        title_panel.setBackground(Color.WHITE);
        
        ImageIcon timg = new ImageIcon("Image/제목.png");
        JLabel tlogo = new JLabel(timg);      
        
		tlogo.setLocation(-150,-10);
		tlogo.setSize(700,100);
		
		title_panel.add(tlogo);

		//메뉴 패널
        JPanel menu_panel = new JPanel(); 
        menu_panel.setPreferredSize(new Dimension(150,600)); //menu_panel 크기 조절
        menu_panel.setBackground(Color.WHITE);
        menu_panel.setLayout(new GridLayout(4,1,0,0));
		

		//레시피 패널
		JPanel recipe_panel = new JPanel();
		recipe_panel.setPreferredSize(new Dimension(400,100));
		recipe_panel.setBackground(new Color(255,204,204));
		
		//아이템 패널
		JPanel item_panel = new JPanel(); 
		
		//왼쪽에 한식, 일식, 중식, 양식 메뉴 버튼 생성 및 부착
		ImageIcon kicon = new ImageIcon("Image/menuicon/kmenu.png");
		ImageIcon jicon = new ImageIcon("Image/menuicon/jmenu.png");
		ImageIcon cicon = new ImageIcon("Image/menuicon/cmenu.png");
		ImageIcon wicon = new ImageIcon("Image/menuicon/wmenu.png");
	
		MenuButton kmenu = new MenuButton("한식", kicon);
		MenuButton jmenu = new MenuButton("일식", jicon);
		MenuButton cmenu = new MenuButton("중식", cicon);
		MenuButton wmenu = new MenuButton("양식", wicon);
		
		menu_panel.add(kmenu);
		menu_panel.add(jmenu);
		menu_panel.add(cmenu);
		menu_panel.add(wmenu);
		
		ItemBar.setPreferredSize(new Dimension(625,650));
		ItemBar.setLocation(0,0);
		ItemBar.setBackground(Color.WHITE);

		
		//메뉴들을 item_bar에 부탁
		KfoodItem korean = new KfoodItem();
		korean.setVisible(true); //시작 시 한국음식 메뉴부터 보임
		
		
		JfoodItem japan = new JfoodItem();
		japan.setVisible(false);
		
		CfoodItem china = new CfoodItem();
		china.setVisible(false);
		
		WfoodItem western = new WfoodItem();
		western.setVisible(false);
		
		//ItemBar에 각각의 아이템들 부착
		ItemBar.add(korean);
		ItemBar.add(japan);
		ItemBar.add(china);
		ItemBar.add(western);
		
		item_panel.add(ItemBar);
		item_panel.setBackground(new Color(255,204,204));
		item_panel.setSize(720,600);
		item_panel.setLocation(0,00);
		
		//c.add(item_panel, BorderLayout.CENTER);

		//menu_panel의 메뉴들을 누르면 해당 아이템들이 보이도록
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
		
		//레시피 패널에 레시피를 띄울 text_area 부착
		recipe_panel.add(text_area, BorderLayout.CENTER);
	
		
		c.add(title_panel, BorderLayout.NORTH);
        c.add(menu_panel, BorderLayout.WEST);
        c.add(item_panel, BorderLayout.EAST);
		c.add(recipe_panel, BorderLayout.SOUTH);
		
		HomeFrame();

	}
	
	public void HomeFrame() {  //전체 프레임의 기본설정 메소드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame이 정상종료 되도록
		setTitle("여러 음식의 요리 레시피");  //타이틀
		setSize(800, 500);  //프레임의 크기
		setVisible(true); //창이 화면에 보이도록
	}
	
	
	public static void main(String[] args) {
		new Recipe_Main();
		new PageMove(ItemBar);   //화면이동 키보드 이벤트
	} 
}
