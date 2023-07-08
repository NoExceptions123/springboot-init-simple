package com.lft.springbootinit.model.dto.post;

import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
*@Pakage com.lft.springbootinit.model.dto.post
*@auther 邮专第一深情
*@date 2023/7/8
*@Description   编辑请求
*/
@Data
public class PostEditRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<String> tags;

    private static final long serialVersionUID = 1L;
}