package com.thoughtworks.mockserver.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.mockserver.entity.BuildingInfo;
import com.thoughtworks.mockserver.entity.HouseNumberInfo;
import com.thoughtworks.mockserver.entity.PhaseInfo;
import com.thoughtworks.mockserver.entity.UserHouse;
import com.thoughtworks.mockserver.entity.UserInfo;
import com.thoughtworks.mockserver.utils.DataGenerator;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


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
    public PhaseInfo getAllPhases() throws IOException {
        HttpGet httpGet = new HttpGet("http://localhost:8081/api/phases?projectId=1");
        CloseableHttpResponse response = client.execute(httpGet);
        HttpEntity entity = response.getEntity();
        String jsonString = EntityUtils.toString(entity);
        return objectMapper.readValue(jsonString, PhaseInfo.class);
    }

    @GetMapping("/users/houses")
    public List<UserHouse> listUserHouses(@RequestParam String customerId) {
        return DataGenerator.listUserHouses();
    }

    @GetMapping("/users")
    public UserInfo getUserInfo(@RequestParam String userId) {
        return DataGenerator.getUserInfo();
    }

    @GetMapping("/projects/{projectId}/phases")
    public List<PhaseInfo> getPhases(@PathVariable String projectId, @RequestParam String source) {
        return DataGenerator.ListPhases();
    }

    @GetMapping("/project-phases/{projectPhaseId}/buildings")
    public List<BuildingInfo> getBuildings(@PathVariable String projectPhaseId, @RequestParam String source) {
        return DataGenerator.ListBuildings();
    }

    @GetMapping("/buildings/{buildingId}/house-numbers")
    public List<HouseNumberInfo> getHouses(@PathVariable String buildingId, @RequestParam String source) {
        return DataGenerator.ListHouseNumber();
    }
}
