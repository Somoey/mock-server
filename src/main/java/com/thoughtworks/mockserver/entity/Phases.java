package com.thoughtworks.mockserver.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Phases {
    @JsonProperty("data")
    private List<Phase> phases;

    @Data
    private static class Phase{
        @JsonProperty("projectPhaseName")
        private String projectPhaseName;

        @JsonProperty("projectPhaseId")
        private String projectPhaseId;
    }
}
