/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption;
import java.io.UnsupportedEncodingException;    
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Sajana
 */
public class Encryption {
    public static void main(String[] args) {
        String encrypted,decrypted;
        String str = "Hello world fuck off 1965232 @@@@ im sajana";
        // encode data using BASE64
        Encryption enc = new Encryption();
        try {
             encrypted=enc.encrypt(str);
             System.out.println(encrypted);
             decrypted=enc.decrypt(encrypted);
             System.out.println(decrypted);
        } catch (Exception e) {
        }
       
    }
    public String encrypt(String text)throws Exception{
    String encoded = DatatypeConverter.printBase64Binary(text.getBytes());
        
        return encoded;
    }
     public String decrypt(String text)throws Exception{
    String decoded = new String(DatatypeConverter.parseBase64Binary(text));
        
        return decoded;
    }
}
