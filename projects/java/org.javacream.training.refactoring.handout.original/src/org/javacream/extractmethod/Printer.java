package org.javacream.extractmethod;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Printer {
	public void printInformation(String[] infos) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt")));
			//writing header
			String delimiter = "_________________________";
			Date date  = new Date();
			bufferedWriter.write("Created at " + date);
			bufferedWriter.write(delimiter);
			//writing infos
			for (String info: infos){
				bufferedWriter.write(info);
			}
			//writing footer
			bufferedWriter.write(delimiter);
			bufferedWriter.write("End");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}


}
