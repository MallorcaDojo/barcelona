package de.cofinpro.bierdeckel.controller;

import de.cofinpro.bierdeckel.domain.DonnerBuddy;
import de.cofinpro.bierdeckel.domain.Drink;
import de.cofinpro.bierdeckel.domain.Party;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */
public interface PartyDao {

    Party addParty(DonnerBuddy buddy, Party party);

    List<Party> showParties(String buddyId);

    DonnerBuddy addDonnerBuddy(DonnerBuddy buddy, String partyId);

    Drink addDrink(String partyId, String buddyId, Drink drink);

    List<Drink> showDrinks(String partyId);
}
