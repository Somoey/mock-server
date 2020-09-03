package com.thoughtworks.mockserver.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class DeleteHouseDataRequest {

    private String projectId;
    private String projectPhaseId;
    private String buildingId;
    private String roomId;
    private String userId;
}
