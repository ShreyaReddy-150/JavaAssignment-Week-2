package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DBList {
	
	private database[] dbobj;
	private String[] dbinvalid;
	
	public DBList() {
		dbobj=new database[0];
		dbinvalid=new String[0];
	}
	
	public database[] getDBArray() {
		return dbobj;
	}
	
	public String[] getInvalidRecordsArray() {
		return dbinvalid;
	}
	
	public void addBD(database db)
	{
		dbobj = Arrays.copyOf(dbobj, dbobj.length + 1);
		dbobj[dbobj.length - 1] = db;
	}
	
	public void addInvalidRecord(String s)
	{
		dbinvalid = Arrays.copyOf(dbinvalid, dbinvalid.length + 1);
		dbinvalid[dbinvalid.length - 1] = s;
	}
	
	public void readFile(String fname) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File(fname));
		input.useDelimiter(",");
		while(input.hasNext())
		{
			String s=input.nextLine();
			String[] arr = s.split(",");
//			for(String x:arr)
//			{
//				System.out.println(x);
//			}
			switch(arr[0])
			{
				case "C":
				{
					centralizedDB db1=new centralizedDB(arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Double.parseDouble(arr[4]));
					addBD(db1);
					//System.out.println(dbobj.length);
					break;
				}
				case "D":
				{
					distributedDB db2 = new distributedDB(arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),Double.parseDouble(arr[5]));
					addBD(db2);
					//System.out.println(dbobj.length);
					break;
				}
				case "H":
				{
					HomogeneousDB db3 = new HomogeneousDB(arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),Double.parseDouble(arr[5]));
					addBD(db3);
					//System.out.println(dbobj.length);
					break;
				}
				case "E":
				{
					HeterogeneousDB db4 = new HeterogeneousDB(arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),Integer.parseInt(arr[4]),Double.parseDouble(arr[5]));
					addBD(db4);
					//System.out.println(dbobj.length);
					break;
				}
				default:{
					addInvalidRecord(s);
					//System.out.println(dbinvalid[0]);
				}
			}
			//System.out.println("------------");
		}
	}
	
	public String generateReport()
	{
		System.out.println("-------------------------");
		System.out.println("Monthly Database Report");
		System.out.println("-------------------------");
		String f="";
		for(database x:dbobj)
		{
			f=f+x+"\n"+"\n";
		}
		return f;
	}
	
	public String generateReportByName()
	{
		System.out.println("-----------------------------------");
		System.out.println("Monthly Database Report (by Name)");
		System.out.println("-----------------------------------");
		Arrays.sort(getDBArray());
		String f="";
		for(database x:dbobj)
		{
			f=f+x+"\n"+"\n";
		}
		return f;
	}
	
	public String generateReportByMonthlyCost()
	{
		System.out.println("-------------------------------------------");
		System.out.println("Monthly Database Report (by Monthly Cost)");
		System.out.println("-------------------------------------------");
		Arrays.sort(getDBArray(),new MonthlyCostComparator());
		String f="";
		for(database x:dbobj)
		{
			f=f+x+"\n"+"\n";
		}
		return f;
	}

}


