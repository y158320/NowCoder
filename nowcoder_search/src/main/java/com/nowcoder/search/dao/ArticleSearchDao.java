package com.nowcoder.search.dao;

import com.nowcoder.search.pojo.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleSearchDao extends ElasticsearchRepository<Article,String> {
}
