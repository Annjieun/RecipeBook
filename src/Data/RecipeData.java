package Data;


import java.io.*;
import java.util.*;

//�ؽ�Ʈ ���Ͽ��� �����Ǹ� �о�� ������ �����ۿ� �ش� �����ǵ��� ����Ѵ�.
public class RecipeData {
	String kresult="", jresult="", cresult="", wresult="";  //�����Ǹ� ���� ���ڿ� ����
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
	
	public String kread(int j) {  //�ؽ�Ʈ ���Ͽ��� ���� �ѽ��� �޴� ������ ��ȯ
		
		
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
	
	public String jread(int j) {  //�ؽ�Ʈ ���Ͽ��� ���� �Ͻ��� �޴� ������ ��ȯ
		
		
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
	
	public String cread(int j) {  //�ؽ�Ʈ ���Ͽ��� ���� �߽��� �޴� ������ ��ȯ
		
		
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
	public String wread(int j) {  //�ؽ�Ʈ ���Ͽ��� ���� ����� �޴� ������ ��ȯ
		
		
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
	
	 
	public RecipeData() {   //���� �����Ǹ��� arraylist�� �����ϰ� �����Ǹ� hashmap�� ����
		
		kname.add("��ġ�");
		kname.add("�����");
		kname.add("û����");
		kname.add("���κ��");
		kname.add("�ᳪ����");
		
		jname.add("���");
		jname.add("Ÿ�ھ߳�");
		jname.add("���丶��");
		jname.add("�Ե�");
		jname.add("����ư�");
		
		cname.add("¥���");
		cname.add("«��");
		cname.add("������");
		cname.add("���󼧱�");
		cname.add("������");
		
		wname.add("�Ľ�Ÿ");
		wname.add("����");
		wname.add("����");
		wname.add("������");
		wname.add("�ܹ���");
		
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

	

