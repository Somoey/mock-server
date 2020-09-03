package com.thoughtworks.mockserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserHouse {

    private String projectId;
    private String houseId;
    private String houseName;
    private HouseInfo houseInfo;
    private String address;
    private String customerServicePhoneNumber;
    private String sourceType;
    private boolean exceptionFlag;
    private String ownerType;
    private String status;
    private String auditStatus;
    private String auditFailedReason;
}
