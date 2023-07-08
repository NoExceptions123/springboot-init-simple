package com.lft.springbootinit.esdao;

import com.lft.springbootinit.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
*@Pakage com.lft.springbootinit.esdao
*@auther 邮专第一深情
*@date 2023/7/8
*@Description   帖子 ES 操作
*/
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}