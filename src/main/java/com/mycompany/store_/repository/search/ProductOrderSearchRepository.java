package com.mycompany.store_.repository.search;

import com.mycompany.store_.domain.ProductOrder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link ProductOrder} entity.
 */
public interface ProductOrderSearchRepository extends ElasticsearchRepository<ProductOrder, Long> {
}
