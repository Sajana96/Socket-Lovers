/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketlovers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Sajana
 */
public class SocketServer {
static  ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    
    public SocketServer() {
         
    }
    
    public void startServer() throws IOException{
            ss = new ServerSocket(3700);
            s=ss.accept();
            din = new  DataInputStream((s.getInputStream()));
            dout = new DataOutputStream(s.getOutputStream());
    }
    public String recieveMessage() throws IOException{
    return  din.readUTF();
    } 
    public void sendMessage(String msgout) throws IOException{
         dout.writeUTF(msgout);
    }
    
}
