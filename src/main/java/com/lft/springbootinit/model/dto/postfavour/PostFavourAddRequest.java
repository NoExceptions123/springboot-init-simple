package com.lft.springbootinit.model.dto.postfavour;

import java.io.Serializable;
import lombok.Data;

/**
*@Pakage com.lft.springbootinit.model.dto.postfavour
*@auther 邮专第一深情
*@date 2023/7/8
*@Description   帖子收藏 / 取消收藏请求
*/
@Data
public class PostFavourAddRequest implements Serializable {

    /**
     * 帖子 id
     */
    private Long postId;

    private static final long serialVersionUID = 1L;
}