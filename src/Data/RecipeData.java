package Data;


import java.io.*;
import java.util.*;

//텍스트 파일에서 레시피를 읽어와 각각의 아이템에 해당 레시피들을 등록한다.
public class RecipeData {
	String kresult="", jresult="", cresult="", wresult="";  //레시피를 담을 문자열 변수
	String recipefile;
	File f = null;
	
	public static HashMap<String, String> krecipe = new HashMap<String, String>();
	public static HashMap<String, String> jrecipe = new HashMap<String, String>();
	public static HashMap<String, String> crecipe = new HashMap<String, String>();
	public static HashMap<String, String> wrecipe = new HashMap<String, String>();
	
	public static ArrayList <String> kname = new ArrayList<String>();
	public static ArrayList <String> jname = new ArrayList<String>();
	public static ArrayList <String> cname = new ArrayList<String>();
	public static ArrayList <String> wname = new ArrayList<String>(); 
	
	
	public static String find_kname(int k) { 
		return kname.get(k);
	}
	
	public static String find_jname(int k) { 		
		return jname.get(k);
		
	}
	
	public static String find_cname(int k) { 
		return cname.get(k);
		
	}
	
	public static String find_wname(int k) { 
		return wname.get(k);
		
	}
	
	public String kread(int j) {  //텍스트 파일에서 읽은 한식의 메뉴 레시피 반환
		
		
		try {
			kresult = "";
			File f = new File("text/krecipe/krecipe"+ j + ".txt");
			BufferedReader reader = new BufferedReader(new FileReader(f));
	        
			String str;
			while ((str = reader.readLine()) != null) {
				kresult = kresult.concat(str);
			}
		}	
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return kresult;
	}
	
	public String jread(int j) {  //텍스트 파일에서 읽은 일식의 메뉴 레시피 반환
		
		
		try {
			jresult = "";
			File f = new File("text/jrecipe/jrecipe"+ j + ".txt");
			BufferedReader reader = new BufferedReader(new FileReader(f));
	        
			String str;
			while ((str = reader.readLine()) != null) {
				jresult = jresult.concat(str);
			}
		}	
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return jresult;
	}
	
	public String cread(int j) {  //텍스트 파일에서 읽은 중식의 메뉴 레시피 반환
		
		
		try {
			cresult = "";
			File f = new File("text/crecipe/crecipe"+ j + ".txt");
			BufferedReader reader = new BufferedReader(new FileReader(f));
	        
			String str;
			while ((str = reader.readLine()) != null) {
				cresult = cresult.concat(str);
			}
		}	
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return cresult;
	}
	public String wread(int j) {  //텍스트 파일에서 읽은 양식의 메뉴 레시피 반환
		
		
		try {
			wresult = "";
			File f = new File("text/wrecipe/wrecipe"+ j + ".txt");
			BufferedReader reader = new BufferedReader(new FileReader(f));
	        
			String str;
			while ((str = reader.readLine()) != null) {
				wresult = wresult.concat(str);
			}
		}	
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return wresult;
	}
	
	 
	public RecipeData() {   //각각 레시피명을 arraylist에 저장하고 레시피를 hashmap에 저장
		
		kname.add("김치찌개");
		kname.add("된장찌개");
		kname.add("청국장");
		kname.add("순두부찌개");
		kname.add("콩나물국");
		
		jname.add("라멘");
		jname.add("타코야끼");
		jname.add("후토마끼");
		jname.add("규동");
		jname.add("가라아게");
		
		cname.add("짜장면");
		cname.add("짬뽕");
		cname.add("마라탕");
		cname.add("마라샹궈");
		cname.add("탕수육");
		
		wname.add("파스타");
		wname.add("수프");
		wname.add("피자");
		wname.add("샐러드");
		wname.add("햄버거");
		
		for(int i=0; i<kname.size(); i++) {
			kread(i);
			krecipe.put(find_kname(i),kresult);
		}
		
		for(int i=0; i<jname.size(); i++) {
			jread(i);
			jrecipe.put(find_jname(i),jresult);
		}
		
		for(int i=0; i<cname.size(); i++) {
			cread(i);
			crecipe.put(find_cname(i),cresult);
		}
		
		for(int i=0; i<wname.size(); i++) {
			wread(i);
			wrecipe.put(find_wname(i),wresult);
		}
	}

}

	

