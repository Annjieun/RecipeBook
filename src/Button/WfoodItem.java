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

//양식 메뉴 아이템 버튼
public class WfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Wcook = new ItemButton[6];
	
	public WfoodItem()  {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));
		
		//양식 메뉴의 아이템 버튼 생성
		Wcook[0]= new ItemButton("피자", "Image/서양음식/피자.png");
		Wcook[1]= new ItemButton("파스타", "Image/서양음식/파스타.png");
		Wcook[2]= new ItemButton("수프", "Image/서양음식/수프.png");
		Wcook[3]= new ItemButton("샐러드", "Image/서양음식/샐러드.png");
		Wcook[4]= new ItemButton("햄버거", "Image/서양음식/햄버거.png");
		Wcook[5]= new ItemButton("양식맛집 추천", "Image/추천.png");
		
		//각 아이템(요리)을 누르면 레시피가 text_area에 나오도록 리스너 등록
		for (i=0; i<Wcook.length-1; i++) {
			Wcook[i].addActionListener(new MyListener());
			add(Wcook[i]);
		}
		
		//Wcook[5] 버튼을 누르면 원하는 중식메뉴에 따라 맛집 추천
		Wcook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("원하는 맛집 메뉴?");

            	switch(input) {
            	case "피자" :
            		System.out.println("비스트로피자 무거동 849-11");
            		break;
            	case "파스타" :
            		System.out.println("파스타부오노 무거동 630-10");
            		break;
            	case "수프" :
            		System.out.println("가무댕댕 무거동 630-18");
            		break;
            	case "샐러드" :
            		System.out.println("그리즈샐러드라운지 신정동 437-7");
            		break;
            	case "햄버거" :
            		System.out.println("행루즈버거 삼산동 1499-3");
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