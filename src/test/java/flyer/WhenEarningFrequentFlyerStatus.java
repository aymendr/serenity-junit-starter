package flyer;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenEarningFrequentFlyerStatus {
	
	@Steps
	TravellerEarningStatusPoints tracy;

	@Steps
	TravellerEarningStatusPoints troy;
	
	@Test
	public void members_should_start_with_Bronze_status() {
		
		// GIVEN
		tracy.joins_the_frequent_flyer_program();
		
		// THEN
		tracy.should_have_a_status_of("Bronze");
	}
	
	@Test
	public void earn_silver_after_10000_kilometers() {
		// GIVEN
		tracy.joins_the_frequent_flyer_program();

		// WHEN
		tracy.flies(10000);
		
		// THEN
		tracy.should_have_a_status_of("Silver");
	}
	
	@Test
    public void memberCanTransferPointsToAnotherMemberWithoutLosingStatus() {
		
		// GIVEN
        tracy.joins_the_frequent_flyer_program();
        troy.joins_the_frequent_flyer_program();

        // AND
        tracy.flies(20000);

        tracy.should_have_a_status_of("Silver");    	

        // WHEN
        tracy.transfers_points(15000, troy);

        // THEN
        troy.should_have_points(15000);

        // AND
        tracy.should_have_a_status_of("Bronze");    	
    }


}
