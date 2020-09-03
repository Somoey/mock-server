package com.thoughtworks.mockserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class PaperInfo {
    private String idCard;
    private String passport;
    private String mainlandPass;
}
