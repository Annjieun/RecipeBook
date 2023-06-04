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


//일식 메뉴 아이템 버튼
public class JfoodItem extends JPanel {
	
	int i;
	public static ItemButton[] Jcook = new ItemButton[6];
	
	public JfoodItem()  {
		
		this.setBackground(Color.WHITE);
		this.setLayout(new GridLayout(3,2));

		//일식 메뉴의 아이템 버튼 생성
		Jcook[0]= new ItemButton("라멘", "Image/일본음식/라멘.png");
		Jcook[1]= new ItemButton("타코야끼", "Image/일본음식/타코야끼.png");
		Jcook[2]= new ItemButton("후토마끼", "Image/일본음식/후토마끼.png");
		Jcook[3]= new ItemButton("규동", "Image/일본음식/규동.png");
		Jcook[4]= new ItemButton("가라아게", "Image/일본음식/가라아게.png");
		Jcook[5]= new ItemButton("일식맛집 추천", "Image/추천.png");
		
		//각 아이템(요리)을 누르면 레시피가 text_area에 나오도록 리스너 등록
		for (i=0; i<Jcook.length-1; i++) {
			Jcook[i].addActionListener(new MyListener());
			add(Jcook[i]);
		
		}
		//Jcook[5] 버튼을 누르면 원하는 중식메뉴에 따라 맛집 추천
		Jcook[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String input = JOptionPane.showInputDialog("원하는 맛집 메뉴?");

            	switch(input) {
            	case "라멘" :
            		System.out.println("라멘집입니다 무거동 485-11");
            		break;
            	case "타코야끼" :
            		System.out.println("타코야킹 대학로 43");
            		break;
            	case "후토마끼" :
            		System.out.println("후토 화양동 8-59");
            		break;
            	case "규동" :
            		System.out.println("스시돈 달동 873-7");
            		break;
            	case "가라아게" :
            		System.out.println("파센토 태화동 477-12");
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