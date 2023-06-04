package Button;

import java.awt.*
;
import javax.swing.*;

//왼쪽 패널의 메뉴 버튼 생성 및 디자인
public class MenuButton extends JButton {
    
    public MenuButton(String text, Icon icon) {
    	super(text, icon);  //버튼에 텍스트와 이미지 동시 출력
    	super.setFont(new Font("함초롬돋움", Font.BOLD, 15));
    	super.setForeground(new Color(102,051,000)); //버튼 글씨색상 설정
    	super.setBackground(new Color(255,204,204)); //버튼 배경색상 설정
    	super.setBorderPainted(false); //버튼 테두리 제거
    	super.setFocusPainted(false);  //버튼 선택시 초점 직사각형 제거
    
    } 

}
