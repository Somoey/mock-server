package com.thoughtworks.mockserver;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;


@SpringBootApplication
public class MockserverApplication {

	private static final int PORT=8081;
	private static final String LOCALHOST="localhost";

	public static void main(String[] args) {
		final WireMockConfiguration config=wireMockConfig()
				.port(PORT);
		final WireMockServer wireMockServer = new WireMockServer(config);
		wireMockServer.start();
		WireMock.configureFor(LOCALHOST,PORT);

		SpringApplication.run(MockserverApplication.class, args);
	}
}
