/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushbackinputstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oli
 */
public class ReadStreamPushBackInputStream {
    public static void main(String[] args)throws FileNotFoundException, IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Masukan nama file: ");
                 
                  String input = br.readLine();
                  PushbackInputStream stream = new PushbackInputStream(new FileInputStream(input));
                  
                 try {
                     int read = stream.read();
                     int read2 = stream.read();
                     int read3 = stream.read();
                     int read4 = stream.read();
                     System.out.println("" + (char) read);
                     System.out.println("" + (char) read2);
                     System.out.println("" + (char) read3);
                     System.out.println("" + (char) read4); 
                 }
                 catch (IOException ex) {
                     Logger.getLogger(ReadStreamPushBackInputStream.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }
}
