package day8;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class charArrayEx
{
	public static void main(String args[])
	{
		FileWriter f=null;
		CharArrayWriter c=null;
		try
		{
			f=new FileWriter("write.txt");
			c=new CharArrayWriter();
			String s="file executed";
			c.write(s);
			c.writeTo(f);
			System.out.println("completed");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		c.close();
		try {
			f.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	
}
