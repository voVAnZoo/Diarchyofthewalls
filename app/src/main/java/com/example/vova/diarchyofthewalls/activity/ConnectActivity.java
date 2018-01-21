package com.example.vova.diarchyofthewalls.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vova.diarchyofthewalls.R;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConnectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect);
    }

    /*public static void conn(String[] args) throws InterruptedException {
        try (ServerSocket server= new ServerSocket(3345)){
            Socket client = server.accept();
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            DataInputStream in = new DataInputStream(client.getInputStream());
            while(!client.isClosed()){
                String entry = in.readUTF();
                System.out.println("READ from client message - "+entry);
                System.out.println("Server try writing to channel");
                if(entry.equalsIgnoreCase("quit")){
                    System.out.println("Client initialize connections suicide ...");
                    out.writeUTF("Server reply - "+entry + " - OK");
                    out.flush();
                    Thread.sleep(3000);
                    break;
                }
                out.writeUTF("Server reply - "+entry + " - OK");
                out.flush();
            }

            in.close();
            out.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
