package clase6.exceptions;

import java.io.FileWriter;

public class LogWriter {

	String message;
	

	public static void writelog(String log) {
		try {
			FileWriter fw = new FileWriter("log.txt", true);
			fw.write(log);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
