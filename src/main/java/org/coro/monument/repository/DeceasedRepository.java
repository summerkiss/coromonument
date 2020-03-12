package org.coro.monument.repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import org.coro.monument.model.Deceased;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DeceasedRepository extends ReactiveCosmosRepository<Deceased, String> {
    Flux<Deceased> findByFirstName(String firstName);
}
