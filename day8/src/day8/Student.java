package day8;

public class Student {
	String sname;
	String dob;
	int m1,m2,m3;
	int avg;
	public Student(String sname, String dob, int m1, int m2, int m3) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		//this.avg = avg;
	}
	public int total(int m1,int m2,int m3)
	{
		return (m1+m2+m3);
	}
	public int average(int m1,int m2,int m3)
	{
		return (m1+m2+m3)/3;
		
	}
	
}