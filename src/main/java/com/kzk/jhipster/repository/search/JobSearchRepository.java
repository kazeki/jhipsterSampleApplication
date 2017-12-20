package com.kzk.jhipster.repository.search;

import com.kzk.jhipster.domain.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Job entity.
 */
public interface JobSearchRepository extends ElasticsearchRepository<Job, Long> {
}
