import Reading_Helper.XMLReader;
import getFlightsListEndPointPage.GetFlightsListPage;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static constants.Constants.EXPECTED_STATUS_CODE;
import static endPointsHelper.EndPointsHelper.stringReturnJsonPath;

@Listeners(ExtentReport.TestListener.class)
public class GetFlightsTest {

    GetFlightsListPage getFlightsListPage = new GetFlightsListPage();
    Response getFlightsListResponse;


    @Test(description = "get flights List and verify Status Code is 200")
    public void verifyFlightsListReturnedSuccessfully() {
        getFlightsListResponse = GetFlightsListPage.GetFlightsListApi(XMLReader.getXMLData("getFlightsQuryParam"));
        Assert.assertEquals(getFlightsListResponse.statusCode(), EXPECTED_STATUS_CODE);
    }

    @Test(description = "get flights List and verify response is not null")
    public void verifyFlightsListResponseIsNotNull() {
        getFlightsListResponse = GetFlightsListPage.GetFlightsListApi(XMLReader.getXMLData("getFlightsQuryParam"));
        String request = stringReturnJsonPath(getFlightsListResponse, "request");
        Assert.assertNotEquals(request, null);
    }

}
