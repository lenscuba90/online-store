package com.mycompany.store_.repository.search;

import com.mycompany.store_.domain.ProductCategory;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link ProductCategory} entity.
 */
public interface ProductCategorySearchRepository extends ElasticsearchRepository<ProductCategory, Long> {
}
