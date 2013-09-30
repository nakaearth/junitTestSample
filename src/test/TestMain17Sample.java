package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TestMain17Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hohoho");
		list.add("FUFUFU");
		for(String value: list) {
			System.out.println(value);
		}
		
		try(Reader reader = new FileReader("test.txt");
			Writer writer = new FileWriter("test2.txt");) {
			System.out.println("HOHOHO");
			int ch;
			while ((ch = reader.read()) != -1 ){
				writer.write(ch);
			}
		} catch (IOException ie){
			// TODO Auto-generated catch block
			System.err.println("ERROR");
		}
        FileSystem fileSystem =  FileSystems.getDefault();
        Path path = fileSystem.getPath("test.txt");
        System.out.println(path.getFileName());	
        Path dest_path = fileSystem.getPath("test/testhoge.txt");
        try {
			Files.copy(path, dest_path);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
