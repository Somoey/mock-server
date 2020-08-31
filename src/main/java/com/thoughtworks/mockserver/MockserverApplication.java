package com.thoughtworks.mockserver;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

@SpringBootApplication
public class MockserverApplication {

	private static final int PORT=8081;//定义mock端口
	private static final String LOCALHOST="localhost";//定义mock服务地址
	private static final String MOCK_DIR="mock";//定义mapping文件目录

	public static void main(String[] args) {
		final WireMockConfiguration config=wireMockConfig()
				.port(PORT)
				.usingFilesUnderClasspath(MOCK_DIR);
		final WireMockServer WireMockServer = new WireMockServer(config);
		WireMockServer.start();
		WireMock.configureFor(LOCALHOST,PORT);
	}
}
