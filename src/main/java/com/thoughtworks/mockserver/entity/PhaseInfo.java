package com.thoughtworks.mockserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PhaseInfo {
    private String projectPhaseName;

    private String projectPhaseId;
}
