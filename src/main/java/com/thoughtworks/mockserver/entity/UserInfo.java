package com.thoughtworks.mockserver.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class UserInfo {

    private String customerId;
    private String memberId;
    private String nickname;
    private String avatar;
    private String sex;
    private String birthday;
    private String bindPhoneNumber;
    private PaperInfo paperInfo;
    private List<String> contactNumber;
}
