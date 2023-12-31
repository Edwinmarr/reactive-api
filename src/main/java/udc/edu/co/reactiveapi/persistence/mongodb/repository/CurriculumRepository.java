package udc.edu.co.reactiveapi.persistence.mongodb.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import udc.edu.co.reactiveapi.persistence.mongodb.entities.CurriculumDocument;

@Repository
public interface CurriculumRepository extends ReactiveMongoRepository<CurriculumDocument,String> {
    Mono<CurriculumDocument> findByTypeIdAndNumberId(String typeId, String numberId);
}
