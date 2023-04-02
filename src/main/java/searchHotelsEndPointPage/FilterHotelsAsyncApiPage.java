package searchHotelsEndPointPage;

import constants.Constants;
import constants.EndPointsUrls;
import endPointsHelper.EndPointsHelper;
import io.restassured.response.Response;

public class FilterHotelsAsyncApiPage {
    public static Response filterHotelsResponse;
    String token = "skdjfh73273$7268u2j89s";
    FilterHotelsRequestBody searchHotelsRequestBody = new FilterHotelsRequestBody();

    public Response filterHotelsApi(String checkIn, String checkOut, String placeId) {
        filterHotelsResponse = EndPointsHelper.postApiHelper(EndPointsUrls.FILTER_HOTELS_API, token, Constants.CONTENT, (searchHotelsRequestBody.searchHotelsRequestBody(checkIn, checkOut, placeId)));
        return filterHotelsResponse;
    }

}

