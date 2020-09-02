package com.thoughtworks.mockserver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.mockserver.entity.Phases;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/mock")
public class MockController {

    private CloseableHttpClient client = HttpClients.createDefault();

    private ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/hello")
    public String mock() throws IOException {
        HttpGet httpGet = new HttpGet("http://localhost:8081/hello");
        CloseableHttpResponse response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        return EntityUtils.toString(entity);
    }

    @GetMapping("/phases")
    public Phases getAllPhases() throws IOException {
        HttpGet httpGet = new HttpGet("http://localhost:8081/api/phases?projectId=1");
        CloseableHttpResponse response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String jsonString = EntityUtils.toString(entity);
        return objectMapper.readValue(jsonString, Phases.class);
    }
}
