package org.javacream.extractmethod;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;

public class Printer {

	public void printInformation(String[] infos) {
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("out.txt")));
			writeFile(bufferedWriter, infos);
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

	private void writeFile(Writer writer, String[] infos) throws IOException {
		writeHeader(writer);
		writeInfos(writer, infos);
		writeFooter(writer);

	}

	private void writeFooter(Writer writer) throws IOException {
		writeDelimiter(writer);
		writer.write("End");
	}

	private void writeInfos(Writer writer, String[] infos) throws IOException {
		for (String info : infos) {
			writer.write(info);
		}
	}

	private void writeHeader(Writer writer) throws IOException {
		Date date = new Date();
		writer.write("Created at " + date);
		writeDelimiter(writer);
	}

	private void writeDelimiter(Writer writer) throws IOException {
		final String DELIMITER = "_________________________";
		writer.write(DELIMITER);

	}
}