package com.thoughtworks.mockserver.utils;

import com.google.common.collect.ImmutableList;
import com.thoughtworks.mockserver.entity.HouseInfo;
import com.thoughtworks.mockserver.entity.UserHouse;

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
}
