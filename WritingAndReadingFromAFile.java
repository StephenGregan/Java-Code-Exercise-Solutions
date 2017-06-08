import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingAndReadingFromAFile {
//Throws
	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		String filename = "src/Thursday.txt";
		
		try{
	
		PrintWriter pw = new PrintWriter(filename);
		pw.println("Hello");
		pw.println("It's Thursday");
		pw.flush();
		pw.close();
		}catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "File could not be created");
			e.printStackTrace();
		}
		
		System.out.println("End of main");
	
		
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
		} catch (IOException e){
			JOptionPane.showMessageDialog(null,"Error reading from file");
			e.printStackTrace();
		} catch(Exception e){
			JOptionPane.showMessageDialog(null,"Something else happened");
			e.printStackTrace();
			
		}
		
		
	}

}
