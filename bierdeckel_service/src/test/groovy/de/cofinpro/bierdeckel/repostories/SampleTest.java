package de.cofinpro.bierdeckel.repostories;

import de.cofinpro.bierdeckel.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/dispatcher-servlet.xml"})
public class SampleTest {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void myTest() {

         assertTrue(true);
    }


}
