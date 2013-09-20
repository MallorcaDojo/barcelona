package de.cofinpro.bierdeckel.domain;

import org.springframework.data.mongodb.core.mapping.Field

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 17:16
 * To change this template use File | Settings | File Templates.
 */
class Account extends AbsEntity {
    @Field("telefon_nr")
    String telefonNr
    @Field("md5_pass")
    String md5Pass
}
