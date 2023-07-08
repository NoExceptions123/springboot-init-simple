package com.lft.springbootinit.model.dto.postthumb;

import java.io.Serializable;
import lombok.Data;

/**
*@Pakage com.lft.springbootinit.model.dto.postthumb
*@auther 邮专第一深情
*@date 2023/7/8
*@Description   帖子点赞请求
*/
@Data
public class PostThumbAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}