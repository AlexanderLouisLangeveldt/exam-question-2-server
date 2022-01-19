package itja_deferredonlineassessment_q2_server;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ITJA_DeferredOnlineAssessment_Q2_Server {

    public static void main(String[] args) {
        try{
            System.out.println("waiting for client");
            ServerSocket servSoc = new ServerSocket(4444);
            Socket soc = servSoc.accept();
            System.out.println("Connection successful");
            BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = input.readLine();
            PrintWriter output = new PrintWriter(soc.getOutputStream(), true);
            output.println("Server says: " + str);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}