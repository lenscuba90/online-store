package com.mycompany.store_.repository.search;

import com.mycompany.store_.domain.OrderItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link OrderItem} entity.
 */
public interface OrderItemSearchRepository extends ElasticsearchRepository<OrderItem, Long> {
}
