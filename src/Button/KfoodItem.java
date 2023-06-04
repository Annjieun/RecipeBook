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

//한식 메뉴 아이템 버튼
public class KfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Kcook = new ItemButton[6];
	
	public KfoodItem()  {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));
		
		//한식 메뉴의 아이템 버튼 생성
		Kcook[0]= new ItemButton("김치찌개", "Image/한국음식/김치찌개.png");
		Kcook[1]= new ItemButton("된장찌개", "Image/한국음식/된장찌개.png");
		Kcook[2]= new ItemButton("청국장", "Image/한국음식/청국장.png");
		Kcook[3]= new ItemButton("순두부찌개", "Image/한국음식/순두부찌개.png");
		Kcook[4] = new ItemButton("콩나물국", "Image/한국음식/콩나물국.png");
		Kcook[5] = new ItemButton("한식맛집 추천", "Image/추천.png");
		
		new RecipeData();  //각 메뉴(아이템)에 레시피를 달아준다.

		//각 아이템(요리)을 누르면 레시피가 text_area에 나오도록 리스너 등록
		for (i=0; i<Kcook.length-1; i++) {
			Kcook[i].addActionListener(new MyListener());
			add(Kcook[i]);
		}
		
		//Kcook[5] 버튼을 누르면 원하는 중식메뉴에 따라 맛집 추천
		Kcook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("원하는 맛집 메뉴?");

            	switch(input) {
            	case "김치찌개" :
            		System.out.println("한옥집김치찜 울산시청점 신정동 702-12");
            		break;
            	case "된장찌개" :
            		System.out.println("예향무거점 장검길 69-23");
            		break;
            	case "청국장" :
            		System.out.println("주상돈청국장 옥동 587-2");
            		break;
            	case "순두부찌개" :
            		System.out.println("태화강순두부 태화동 741-12");
            		break;
            	case "콩나물국" :
            		System.out.println("전주양반콩나물국밥 무거동 1533-5");
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

