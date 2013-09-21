package de.cofinpro.bierdeckel.repositories

import de.cofinpro.bierdeckel.controller.PartyDao
import de.cofinpro.bierdeckel.domain.DonnerBuddy
import de.cofinpro.bierdeckel.domain.Drink
import de.cofinpro.bierdeckel.domain.Party
import org.springframework.beans.factory.annotation.Autowire
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

/**
 * Created with IntelliJ IDEA.
 * User: dawidk
 * Date: 20.09.13
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */

@Component
class PartyService implements PartyDao {

    @Autowired
    PartyRepository partyRepository

    @Override
    Party addParty(Party party) {
        List<DonnerBuddy> buddies = new ArrayList<DonnerBuddy>()
        //buddies.add(buddy)
        party.setDonnerBuddies(buddies)
        partyRepository.save(party);
    }

    @Override
    List<Party> showParties(String buddyId) {
       return null;
    }

    @Override
    DonnerBuddy addDonnerBuddy(DonnerBuddy buddy, String partyId) {
        Party party = null;  //TODO Party ermitteln
        party.getDonnerBuddies().add(buddy);
       partyRepository.save(party);
    }

    @Override
    Drink addDrink(String partyId, String buddyId, Drink drink) {
        return null
    }

    @Override
    List<Drink> showDrinks(String partyId) {
              return null;
    }
}
