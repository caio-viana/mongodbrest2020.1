package mongodbrest.ancestrais;

import org.springframework.data.mongodb.repository.MongoRepository;

import mongodbrest.ancestrais.Ancestral;

public interface AncestraisRepository extends MongoRepository<Ancestral, String> {

}
