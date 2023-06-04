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

//중식 메뉴 아이템 버튼
public class CfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Ccook = new ItemButton[6];
	
	public CfoodItem() {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));
		
		//중식 메뉴의 아이템 버튼 생성
		Ccook[0]= new ItemButton("짜장면", "Image/중국음식/짜장면.png");
		Ccook[1]= new ItemButton("짬뽕", "Image/중국음식/짬뽕.png");
		Ccook[2]= new ItemButton("마라탕", "Image/중국음식/마라탕.png");
		Ccook[3]= new ItemButton("마라샹궈", "Image/중국음식/마라샹궈.png");
		Ccook[4]= new ItemButton("탕수육", "Image/중국음식/탕수육.png");
		Ccook[5]= new ItemButton("중식맛집 추천", "Image/추천.png");
		
		//각 아이템(요리)을 누르면 레시피가 text_area에 나오도록 리스너 등록
		for (i=0; i<Ccook.length-1; i++) {
			Ccook[i].addActionListener(new MyListener());
			add(Ccook[i]);
		}
		//Ccook[5] 버튼을 누르면 원하는 중식메뉴에 따라 맛집 추천
		Ccook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("원하는 맛집 메뉴?");

            	switch(input) {
            	case "짜장면" :
            		System.out.println("천손짜장 무거동 272-5");
            		break;
            	case "짬뽕" :
            		System.out.println("화짬뽕 무거동 828-27");
            		break;
            	case "마라탕" :
            		System.out.println("화공방 야음동 384-3");
            		break;
            	case "마라샹궈" :
            		System.out.println("마라탠쿵 삼산동 1550-20");
            		break;
            	case "탕수육" :
            		System.out.println("공리 무거동 564-23");
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