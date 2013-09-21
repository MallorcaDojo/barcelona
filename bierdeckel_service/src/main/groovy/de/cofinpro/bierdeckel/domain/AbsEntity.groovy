package de.cofinpro.bierdeckel.domain;

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Version
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 10.09.13
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
@Document
abstract class AbsEntity implements Serializable {
    @Id
    String id
    @CreatedDate
    Date created
    @LastModifiedDate
    Date updated
    @Version
    Long version

    @Field("user_updated")
    @LastModifiedBy
    String userUpdated

    @Field("user_created")
    @CreatedBy
    String userCreated
}
