package stepdef;

import cucumber.api.java.en.Given;
import pageobjects.HomePage;

public class HomeStepDef{

	HomePage hp1 = new HomePage();
	HomePage hp2 = new HomePage("Sabin");
	HomePage hp3 = new HomePage("Sabin",32);

	@Given ("^users name and age$")
	public void users_name_and_age() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("USers name and age");
		hp3.displayName();
		
	}

	
HomePage hp = new HomePage();

@Given("^open the browser$")
public void open_the_browser() throws Throwable {
	hp.selectBrowser("Chrome");
}

@Given("^navigate to home page \"([^\"]*)\"$")
public void navigate_to_home_page(String arg1) throws Throwable {
    //hp.navigateToUrl(arg1);
    hp.launchApp();
}

@Given("^verify that \"([^\"]*)\" page is displayed$")
public void verify_that_page_is_displayed(String arg1) throws Throwable {
    hp.verifyPage(arg1);

}

@Given("^click on \"([^\"]*)\" link available$")
public void click_on_link_available(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
}

@Given("^verify that label text is \"([^\"]*)\"$")
public void verify_that_label_text_is(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
}

@Given("^close application$")
public void close_application() throws Throwable {
    hp.closeApp();
}


}//class
