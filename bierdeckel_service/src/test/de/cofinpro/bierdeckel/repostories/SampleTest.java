package de.cofinpro.bierdeckel.repostories;

import de.cofinpro.bierdeckel.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
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
@ContextConfiguration(locations={"classpath*:dispatcher-servlet.xml"})
public class SampleTest {

    @Test
    public void myTest() {
                     new AccountContr
            new Account();
         assertTrue(true);
    }


}
