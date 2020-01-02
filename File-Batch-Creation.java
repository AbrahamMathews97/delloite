package InputOutput;

import java.io.File;
import java.io.IOException;
//import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;

public class Demo2 {
   
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Admin\\Desktop\\java\\Batch\\BatchMates.txt");
		File directory=new File("C:\\\\Users\\\\Admin\\\\Desktop\\\\java\\\\Batch\\\\");
		File in_directory=new File("C:\\Users\\Admin\\Desktop\\java\\Batch\\batch");
		
		if(file.exists() || directory.exists())
		{
			System.out.println("Directory already exists");
		//	file.delete();
		//	directory.delete();
			
		}
		else
		{   
			directory.mkdirs();
			in_directory.mkdirs();
			file.createNewFile();
			System.out.println("Directory created");
			System.out.println("File Batch.txt created ");
		}
		
		File[] flist=directory.listFiles();
		for(File f : flist)
		{
			if(f.isFile())
			{
				System.out.println(f.getName()+" is a File");
			} 
			else if(f.isDirectory())
			{
				System.out.println(f.getName()+" is a directory");
			}
		}
		System.out.println("Delete Files(0 for Yes, 1 for true)");
		Scanner input=new Scanner(System.in);
		int choice=input.nextInt();
		input.close();
		if(choice==0)
		{
			file.delete();
			in_directory.delete();
			directory.delete();
		}
		else
		{
			System.out.println("Directories not deleted and remains in the folder");
		}
	}
		
}
