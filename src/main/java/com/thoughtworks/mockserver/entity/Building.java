package com.thoughtworks.mockserver.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Building {

    private List<BuildingBean> buildings;

    @NoArgsConstructor
    @Data
    private static class BuildingBean {
        private String buildingName;
        private String buildingId;
    }
}
