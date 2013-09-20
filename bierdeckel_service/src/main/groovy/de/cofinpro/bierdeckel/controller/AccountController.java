package de.cofinpro.bierdeckel.controller;

import de.cofinpro.bierdeckel.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AccountController {

    @ResponseBody
    @RequestMapping(value = "/accounts", method = RequestMethod.GET)
    public Account accounts() {
        System.out.println("Hallo Welt");

        Account account = new Account();
        account.setTelefonNr("015116118602");
        account.setMd5Pass("#asdasd45wtrffas");
        return account;
    }

}
