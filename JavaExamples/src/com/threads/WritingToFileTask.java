package com.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class FileWrite implements Runnable{

	public static String getString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
	
	@Override
	public void run() {
		//String str = "I will be written in the file";
		
		String ranStr = getString();
		
		File f = new File("demo.txt");
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fos = new FileOutputStream(f);
			System.out.println("Wirting to a file ");
			fos.write(ranStr.getBytes());
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
public class WritingToFileTask {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new FileWrite(), "thread 0");
		t1.start();
		System.exit(0);
	}

}
