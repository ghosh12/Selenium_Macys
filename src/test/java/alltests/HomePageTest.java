package alltests;

import alltests.base.TestBase;
import alltests.base.TestListener;
import browser.Browser;
import dataprovider.HomePageDataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 1/29/2018.
 */
@Listeners(value= TestListener.class)
public class HomePageTest extends TestBase {

    @Test(groups = {"regression"}, dataProvider="MacysHomePageData", dataProviderClass=HomePageDataProvider.class)
    public void testHomePage(String linkName){
        Browser
                .openBrowser()
                .clickLinkFromTopNavs(linkName);
    }

    @Test(groups = {"smoke", "regression"})
    public void testNavNames(){
        Browser.openBrowser().verifyLinkNamesPresent();
    }

}
