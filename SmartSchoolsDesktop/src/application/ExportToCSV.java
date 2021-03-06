package application;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

public class ExportToCSV {
	public static boolean export(String absolutePath, String name, String[] col, ArrayList<String[]> data) throws FileNotFoundException{
		System.out.println(name);
		if(col.length != data.get(0).length){
			System.out.println("question col length not same");
			return false;
		}
		
		try{
			Date date = Calendar.getInstance().getTime();
			PrintWriter writer = new PrintWriter(new File(absolutePath + File.separator + name + " created "+ date.toString().replace(':', '.') + ".csv"));
			
			
			StringBuilder builder = new StringBuilder();
			
			builder.append(Arrays.stream(col).collect(Collectors.joining(", "))).append("\n");
			
			builder.append(data.stream().map(row -> Arrays.stream(row).collect(Collectors.joining(", "))).collect(Collectors.joining("\n")));
			
			writer.write(builder.toString());
			writer.close();
		}catch(Exception e){
			System.out.println("csv export question "+e.toString());
			return false;
		}
		
		return true;
	}
}
