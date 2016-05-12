package test;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class CopyData
{
//	String outPut="src/test/out.txt";
	public CopyData(String filePath) throws Exception
	{
		// TODO Auto-generated constructor stub
		FileReader reader=new FileReader(filePath);
		BufferedReader bf=new BufferedReader(reader);
		String line;
		CharArrayWriter cWriter=new CharArrayWriter();
		while((line=bf.readLine())!=null)
		{
			String changeData="";
			for(int i=0;i<line.length();i++)
			{
				if(line.charAt(i)=='1')
				{
					changeData=changeData+"01";
				}
				if(line.charAt(i)=='0') 
				{
					changeData=changeData+"10";
				}
			}
			cWriter.write(changeData);
			cWriter.append(System.getProperty("line.separator"));  
		}
		bf.close();
		reader.close();
		
		
		
		File file=new File(filePath);
		if (!file.exists())
		{
			file.createNewFile();
		}
		FileWriter fWriter=new FileWriter(file);
		cWriter.writeTo(fWriter);
		
	}
	
	public static void main(String[] args)throws Exception
	{
		String filePath="src/test/data.txt";
		CopyData copyData=new CopyData(filePath);
	}
}
