import Reading_Helper.XMLReader;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import searchHotelsEndPointPage.FilterHotelsAsyncApiPage;

import static constants.Constants.EXPECTED_STATUS_CODE;
import static endPointsHelper.EndPointsHelper.stringReturnJsonPath;

@Listeners(ExtentReport.TestListener.class)
public class FilterHotelsAsyncTest {

    FilterHotelsAsyncApiPage searchHotelsPage = new FilterHotelsAsyncApiPage();
    Response searchHotelsResponse;


    @Test(description = "Filter Hotels List successfully and assert status code")
    public void filtersHotelsSuccessfully() {
        searchHotelsResponse = searchHotelsPage.filterHotelsApi(XMLReader.getXMLData("checkIn"), XMLReader.getXMLData("checkOut"), XMLReader.getXMLData("placeId"));
        Assert.assertEquals(searchHotelsResponse.statusCode(), EXPECTED_STATUS_CODE);
    }

    @Test(description = "Filter Hotels List successfully and assert SID code is not equal NULL")
    public void filtersHotelsSuccessfullyAndCheckResponse() {
        searchHotelsResponse = searchHotelsPage.filterHotelsApi(XMLReader.getXMLData("checkIn"), XMLReader.getXMLData("checkOut"), XMLReader.getXMLData("placeId"));
        String sId = stringReturnJsonPath(searchHotelsResponse, "sId");
        Assert.assertNotEquals(sId, null);
    }

}
