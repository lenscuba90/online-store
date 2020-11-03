package com.mycompany.store_.repository.search;

import com.mycompany.store_.domain.Invoice;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


/**
 * Spring Data Elasticsearch repository for the {@link Invoice} entity.
 */
public interface InvoiceSearchRepository extends ElasticsearchRepository<Invoice, Long> {
}
