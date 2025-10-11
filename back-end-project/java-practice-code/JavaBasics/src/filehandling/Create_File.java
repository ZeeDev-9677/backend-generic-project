package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Create_File {

	public static void main(String[] args){
		// file creation using File class and its createNewFile() method

		try {
			File file = new File("C:\\Users\\ZEESHAN\\Desktop\\MyProject\\\\deleted files\\zeefile4.txt");
			if (file.createNewFile()) {
				System.out.println("file created " + file.getName());
			} else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			System.out.println("An Error occurred");
			e.printStackTrace();
		}

		// delete file using File class and its delete() method

		/*
		 * File obj = new File("C:\\Users\\ZEESHAN\\Desktop\\MyProject\\zeefile1.txt");
		 * if (obj.delete()) { System.out.println("deleted successfully " +
		 * obj.getName()); } else {
		 * System.out.println("File already deleted successfully"); }
		 */

		// write file using FileWriter class and its write() method

		/*
		 * try { FileWriter fw = new
		 * FileWriter("C:\\Users\\ZEESHAN\\Desktop\\MyProject\\zeefile.txt");
		 * fw.write("hii my all subscribers good morning!!!!"); fw.close();
		 * System.out.println("Contents wrote"); } catch (IOException e) {
		 * System.out.println("An error occurred!!"); e.printStackTrace(); }
		 */

		// read file contents using Scanner class and also will File class

		/*
		 * try { File obj=new
		 * File("C:\\Users\\ZEESHAN\\Desktop\\MyProject\\zeefile1.txt"); Scanner sc=new
		 * Scanner(obj); while(sc.hasNextLine()) { String data=sc.nextLine();
		 * System.out.println("successfully read the file contents     ="+data); }
		 * sc.close(); } catch(FileNotFoundException e) {
		 * System.out.println("An Error Occurred!!!"); e.printStackTrace(); }
		 */

		// get file information like file name, size ,writable,readable using File
		// class.

		/*
		 * File fe = new File("C:\\Users\\ZEESHAN\\Desktop\\MyProject\\zeefile.txt"); if
		 * (fe.exists()) { System.out.println("Yes got it the file name is = " +
		 * fe.getName()); System.out.println("exact path of file is = " +
		 * fe.getAbsolutePath()); System.out.println("is it writable = " +
		 * fe.canWrite()); System.out.println("is it readable = " + fe.canRead());
		 * System.out.println("the size of the file is = " + fe.length()); } else {
		 * System.out.println("Not found"); }
		 */

	}

}
