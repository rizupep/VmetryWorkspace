package textfiletest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Textfiletest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\selenium\\filehandlingtest\\file\\Test.txt");
		// f.createNewFile();// to create one
		if (!f.exists()) {// to check whether it is there or not
			f.createNewFile();

		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("vmetry1");
		bw.newLine();
		bw.write("vmetry2");
		bw.newLine();
		bw.newLine();
		bw.write("vmetry3");
		bw.newLine();
		bw.write("vmetry4");
		bw.close();// mandatory to close
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		// String data = br.readLine();//this command reads the current line
		// System.out.println(data);
		String data = "";
		while ((data = br.readLine()) != null) {// !not equal to symbol
			System.out.println(data);
		}
	}

}
