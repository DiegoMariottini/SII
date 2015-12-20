package init;

import java.util.Iterator;
import java.util.List;

import tokenization.Parser;

public class DataSet {
	private static String cv="";
	
	 public static void main(String[] args) {
		 Parser p= new Parser();
		 List<String> results=p.CreateDataSet(cv);
		 Iterator<String> it= results.iterator();
		 while(it.hasNext())
			 System.out.println("\n"+it.next().toString());
	 }
	 

}
