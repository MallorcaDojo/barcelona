package de.cofinpro.bierdeckel.controller;


import de.cofinpro.bierdeckel.domain.Party;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 18:44
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class PartyController {

    public Party addEvent(Donnerbuddy buddy, Party party)  {
       return null;
    }


    public List<Party> showParties(String donnerbuddyId) {
      return null;
    }
}
