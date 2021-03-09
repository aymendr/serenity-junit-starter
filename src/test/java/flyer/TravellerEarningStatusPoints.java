package flyer;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;

public class TravellerEarningStatusPoints {

	private String actor;
	
	private FrequentFlyer frequentFlyer;
	
	private String status;
	
	@Step("#actor joins the frequent flyer program")
	public void joins_the_frequent_flyer_program() {
		// TODO Auto-generated method stub
        frequentFlyer = FrequentFlyer.withInitialBalanceOf(0);
		
	}
	
    @Step("#actor flies {0} km") 
	public void flies(int distance) {
		// TODO Auto-generated method stub
        frequentFlyer.recordFlightDistanceInKilometers(distance);
	}
	
    @Step("#actor should have a status of {0}")
    public void should_have_a_status_of(String expectedStatus) {
        assertThat(frequentFlyer.getStatus()).isEqualTo(expectedStatus.toString());
    	
    }
	
    @Step("#actor transfers {0} points to {1}")
    public void transfers_points(int points, TravellerEarningStatusPoints otherFrequentFlier) {
    	
    	otherFrequentFlier.frequentFlyer.recordFlightDistanceInKilometers(points);
    	frequentFlyer.remove_transfered_points(points);
    	
    }
    
    @Step("#actor should have {0} points")
    public void should_have_points(int expectedPoints) {
    	assertThat(frequentFlyer.getBalance()).isEqualTo(expectedPoints);
    }
    
    public String toString() {
    	return actor;
    }
    
    

}
