package com.thoughtworks.mockserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BuildingInfo {
    private String buildingName;
    private String buildingId;
}
