/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushbackinputstream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author oli
 */
public class ReadStreamPushBackReader {
   public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String filepath = "C:\\Users\\oli\\Documents\\NetBeansProjects\\PushbackInputStream\\coba.txt";
        File path = new File(filepath);
        PushbackReader reader = new PushbackReader(new InputStreamReader(new FileInputStream(path)));
        char[] words = new char[(int) path.length()];
            try {
                reader.read(words);
                System.out.println("" + new String(words));
                words = new char[8];
                reader.unread(words);
            } catch (IOException ex) {
                Logger.getLogger(ReadStreamPushBackReader.class.getName()).log(Level.SEVERE, null, ex);
                
            }
    }
}
