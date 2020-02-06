package output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Outputter<T> {
	private String fileExtension;
	
	public Outputter() {
		fileExtension = ".s";
	}
	
	public void output(String filename, List<T> toOutput){
		int dotIndex = filename.lastIndexOf(".java");
		String outFile = filename.substring(0, dotIndex) + fileExtension; 
		try(FileWriter out = new FileWriter(new File(outFile))){
			for(int i = 0; i < toOutput.size(); i++){
				out.append(toOutput.get(i)+"\n");
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void output(String filename, T toOutput) {
		int dotIndex = filename.lastIndexOf(".java");
		String outFile = filename.substring(0, dotIndex) + fileExtension; 
		try(FileWriter out = new FileWriter(new File(outFile))){
			out.append(toOutput.toString());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
