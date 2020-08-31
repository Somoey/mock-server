package com.thoughtworks.mockserver;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {

    @Test
    void demo() throws IOException {
        WireMockServer wireMockServer = new WireMockServer();
        wireMockServer.start();
        stubFor(get("/demo")
                .willReturn(aResponse()
                .withBody("Welcome to China!")));

        CloseableHttpClient client = HttpClients.createDefault();

        HttpGet request = new HttpGet("http://localhost:8080/demo");
        HttpResponse httpResponse = client.execute(request);

        String response = convertResponseToString(httpResponse);

        assertEquals("Welcome to China!", response);
    }

    private String convertResponseToString(HttpResponse response) throws IOException {
        InputStream responseStream = response.getEntity().getContent();
        Scanner scanner = new Scanner(responseStream, "UTF-8");
        String responseString = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return responseString;
    }
}
