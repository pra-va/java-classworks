package _4_Java_chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class JavaChatServer {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(3333);
				Socket socket = serverSocket.accept();
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream))) {
			String stringOne = ""; // Input
			String stringTwo = ""; // Output
			System.out.println("Server started");
			while (!stringOne.equals("stop")) {
				stringOne = dataInputStream.readUTF();
				System.out.println("Client message: " + stringOne);
				System.out.println("(Server) Write message:");
				Scanner scanner = new Scanner(System.in);
				stringTwo = scanner.nextLine();
				dataOutputStream.writeUTF(stringTwo);
				dataOutputStream.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
