package day8;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderEx {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		final PipedWriter pw=new PipedWriter();
		@SuppressWarnings("resource")
		final PipedReader pr=new PipedReader();
		
		Thread t1=new Thread()
			{
			public void run() 
			{
				try {
					pw.write("piped reader and piped writer executed");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	};
				Thread t2=new Thread()
				{
			public void run() 
			{
				try {
					int i=pr.read();
					while((i=pr.read())!=-1)
					{
						System.out.print((char)i);
					}
					Thread.sleep(4000);
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				};
 t1.start();
 t2.start();
	}

}
