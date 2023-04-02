package getFlightsListEndPointPage;

import constants.Constants;
import constants.EndPointsUrls;
import endPointsHelper.EndPointsHelper;
import io.restassured.response.Response;

public class GetFlightsListPage {
    public static Response getFlights;
    public static Response GetFlightsListApi(String query) {
        getFlights= EndPointsHelper.getApiHelper(EndPointsUrls.GET_FLIGHTS_API,Constants.PARAM,query);
        return getFlights;
    }
}
