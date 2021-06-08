package me.qingy.principle.srp;

/**
 * @author qingy
 * @since 2021-06-08
 */
public class UserInfo {
    private long userId;
    private String username;
    private String email;
    private String telephone;
    private long createTime;
    private long lastLoginTime;
    private String avatarUrl;

    /* ---------- 不同应用场景或不同阶段的需求背景下，对单一的判定是不同的，比如物流信息 ---------- */
    private String provinceOfAddress;
    private String cityOfAddress;
    private String regionOfAddress;
    private String detailedAddress;
}

