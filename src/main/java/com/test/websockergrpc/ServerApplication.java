package com.test.websockergrpc;

import org.glassfish.tyrus.server.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.websocket.DeploymentException;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        Server serverWS;
        serverWS = new Server("0.0.0.0", 8011, "", null, ExampleSocket.class);
        try {
            serverWS.start();
        } catch (DeploymentException e) {
            e.printStackTrace();
        }
        SpringApplication.run(ServerApplication.class, args);
    }

}
