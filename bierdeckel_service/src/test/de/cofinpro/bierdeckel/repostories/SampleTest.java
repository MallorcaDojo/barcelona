package de.cofinpro.bierdeckel.repostories;

import de.cofinpro.bierdeckel.domain.DonnerBuddy;
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
@ContextConfiguration(locations={"file:/Users/dawidk/devel/dojo2013/barcelona/bierdeckel_service/src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class SampleTest {

    //@Autowired
    //de.cofinpro.bierdeckel.repositories.TestRepository testRepository;

    @Test
    public void myTest() {
         //   assertNotNull(testRepository);

    }


}
