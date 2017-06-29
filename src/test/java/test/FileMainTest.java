package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileMainTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		FileReader read=new FileReader(new File("D:/baidu/BaiduNetdisk/libtorrent_license.txt"));
//		BufferedReader br=new BufferedReader(read);
//		int count=0;
//		String line="";
//		
//		while((line=br.readLine())!=null){
//			System.out.println(line);
//			while(line.indexOf("of")>-1){
//				System.out.println("nihap");
//			count++;
//			line=line.substring(line.indexOf("of"), line.length());
//			}
//		}
//		System.out.println(count);
		returnName("D:/Bin");
	}
	public static void returnName(String name){
		File dir=new File(name);
		System.out.println(dir.getName());
		File[] files=dir.listFiles();
		for(int i=0;i<files.length;i++)
		 {
		if(files[i].isDirectory()){
		returnName(files[i].getName());
		}else{System.out.println(files[i].getName());}}}

}
