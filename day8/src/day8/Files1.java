package day8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.OutputStream;
//import java.io.PrintWriter;

public class Files1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fil=null;
		DataOutputStream dos=null;
			try {
				for(int i=0;i<5;i++)
				{
					String filename="hello"+i+".txt";
					fil=new FileOutputStream(filename);
					dos=new DataOutputStream(fil);
				
				dos=new DataOutputStream(fil);
				//int i=100;
				dos.writeInt(123654);
				dos.writeByte(124);
				dos.writeDouble(52.5);
				dos.writeChar('d');
				dos.writeUTF("hello world");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				fil.close();
				dos.close();
			}
			FileInputStream fis=null;
			DataInputStream dis=null;
			try
			{
				for(int i=0;i<5;i++)
				{
				String filename="hello"+i+".txt";
				fis= new FileInputStream(filename);
				dis=new DataInputStream(fis);
				int a=dis.readInt();
				byte b=dis.readByte();
				double d=dis.readDouble();
				char c=dis.readChar();
				String s=dis.readUTF();
				System.out.println("Output:"+ a+" integer\n "+b+" byte\n "+d+" double\n "+c+" char\n "+s);
				}
			}
			finally
			{
				try
				{
				fis.close();
				dis.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
	}
}
