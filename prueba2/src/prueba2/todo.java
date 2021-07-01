package prueba2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class todo {
	
	public static void main (String[] args) throws FileNotFoundException, IOException {
	try {
	FileInputStream direccion;
	JFileChooser fileChooser=new JFileChooser();
    fileChooser.setCurrentDirectory(new File("C:\\Users\\hamee\\Downloads"));
    fileChooser.setDialogTitle("Select Mp3");
    fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    fileChooser.setFileFilter(new FileNameExtensionFilter("Mp3 files","mp3"));
    fileChooser.setMultiSelectionEnabled(true);
    if(fileChooser.showOpenDialog(fileChooser)==JFileChooser.APPROVE_OPTION){
    File myFile=fileChooser.getSelectedFile();
    direccion = new FileInputStream(myFile.getPath());
    System.out.println(direccion.toString());
    }
    
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		
	}
}
