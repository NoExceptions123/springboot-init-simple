package com.lft.springbootinit.common;

import java.io.Serializable;
import lombok.Data;

/**
*@Pakage com.lft.springbootinit.common
*@auther 邮专第一深情
*@date 2023/7/8
*@Description   删除请求
*/
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}