package com.shekhar.wordgame.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.glassfish.tyrus.server.Server;

public class WebSocketServer {

	public static void main(String[] args) {
		runServer();
	}

	public static void runServer() {
		Server server = new Server("localhost", 8025, "/websockets", WordgameServerEndpoint.class);
		Server server1 = new Server("localhost", 8026, "/websockets", WordgameServerEndpoint1.class);

		try {
			server.start();
			server1.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please press a key to stop the server.");
			reader.readLine();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			server.stop();
		}
	}
}