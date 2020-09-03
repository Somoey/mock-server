package com.thoughtworks.mockserver.utils;

import com.google.common.collect.ImmutableList;
import com.thoughtworks.mockserver.entity.HouseInfo;
import com.thoughtworks.mockserver.entity.PaperInfo;
import com.thoughtworks.mockserver.entity.PhaseInfo;
import com.thoughtworks.mockserver.entity.UserHouse;
import com.thoughtworks.mockserver.entity.UserInfo;

import java.util.List;

public class DataGenerator {
    public static List<UserHouse> listUserHouses() {
        HouseInfo houseInfo = HouseInfo.builder().phase("1期").building("1栋").room("101").build();

        UserHouse house1 = UserHouse.builder()
                .projectId("id1")
                .houseId("id1")
                .houseName("招商雍景湾")
                .houseInfo(houseInfo)
                .address("广东深圳南山爱榕路48号")
                .customerServicePhoneNumber("01087888888")
                .sourceType("物业")
                .exceptionFlag(Boolean.TRUE)
                .ownerType("业主")
                .status("未交付")
                .auditStatus("审核失败")
                .auditFailedReason("业主信息缺失，请去物业登记")
                .build();

        UserHouse house2 = UserHouse.builder()
                .projectId("id1")
                .houseId("id1")
                .houseName("招商雍景湾")
                .houseInfo(houseInfo)
                .address("广东深圳南山爱榕路48号")
                .customerServicePhoneNumber("01087888888")
                .sourceType("物业")
                .exceptionFlag(Boolean.TRUE)
                .ownerType("业主")
                .status("未交付")
                .auditStatus("审核失败")
                .auditFailedReason("业主信息缺失，请去物业登记")
                .build();

        UserHouse house3 = UserHouse.builder()
                .projectId("id1")
                .houseId("id1")
                .houseName("招商雍景湾")
                .houseInfo(houseInfo)
                .address("广东深圳南山爱榕路48号")
                .customerServicePhoneNumber("01087888888")
                .sourceType("物业")
                .exceptionFlag(Boolean.TRUE)
                .ownerType("业主")
                .status("已交付")
                .build();

        return ImmutableList.of(house1, house2, house3);
    }

    public static UserInfo getUserInfo() {
        PaperInfo paperInfo = PaperInfo.builder().idCard("510110xxxxxxxx0001")
                .passport("878xxxxxxxxxxxxx02")
                .mainlandPass("878xxxxxxxxxxxxx02")
                .build();

        return UserInfo.builder()
                .customerId("1234567")
                .memberId("1234567")
                .nickname("昵称")
                .avatar("https://oss/avatar.png")
                .sex("")
                .birthday("19900101")
                .bindPhoneNumber("17700000001")
                .contactNumber(ImmutableList.of("17700000002", "17700000003"))
                .paperInfo(paperInfo)
                .build();
    }

    public static List<PhaseInfo> ListPhases() {
        PhaseInfo phase1 = PhaseInfo.builder().projectPhaseId("id1").projectPhaseName("招商雍景湾一期").build();
        PhaseInfo phase2 = PhaseInfo.builder().projectPhaseId("id2").projectPhaseName("招商雍景湾二期").build();
        PhaseInfo phase3 = PhaseInfo.builder().projectPhaseId("id3").projectPhaseName("招商雍景湾三期").build();
        return ImmutableList.of(phase1, phase2, phase3);
    }
}
