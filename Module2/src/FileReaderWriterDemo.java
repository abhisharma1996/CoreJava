
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
 
import javax.swing.text.StyledEditorKit.ForegroundAction;
public class FileReaderWriterDemo {
	public static void main(String [ ]args) throws IOException{
	String s=new String();
	char a[]=new char[10];
	FileWriter fc=new FileWriter("abhi.txt")	;
	fc.write("Capgemini");
	fc.flush();
	fc.close();
	FileReader fr= new FileReader("abhi.txt");
	int i=fr.read();
	int j=0;
	while(i!=-1){
				a[j]=(char)i;
				i=fr.read();
				j++;
	}
 
	/*for (int j2 = 0; j2 < a.length-1; j2++) {
		System.out.print(a[j2]);
	}*/
 
	String sb=new String();
	sb=Arrays.toString(a);
	String reverse="";
	for (int k = sb.length()-5; k>0; k--)
		reverse=reverse+sb.charAt(k);
 
	/*System.out.println(reverse);*/	
	FileWriter rf=new FileWriter("abhi.txt",false);
	rf.write(reverse);
	rf.flush();
	rf.close();
	FileReader ft= new FileReader("abhi.txt");
	int t=ft.read();
	while(t!=-1){
				System.out.print((char)t);
				t=ft.read();
 
	}
}
 
}