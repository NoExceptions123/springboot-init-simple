package com.lft.springbootinit.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
*@Pakage com.lft.springbootinit.model.dto.user
*@auther 邮专第一深情
*@date 2023/7/8
*@Description   用户更新请求
*/
@Data
public class UserUpdateRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}