package de.cofinpro.bierdeckel.repositories

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 23:43
 * To change this template use File | Settings | File Templates.
 */
@Component
@Repository
class TestRepository {

    @Autowired
    MongoTemplate mongoTemplate;


}
