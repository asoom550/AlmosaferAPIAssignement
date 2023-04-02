package searchHotelsEndPointPage;

import org.json.JSONArray;
import org.json.JSONObject;


public class FilterHotelsRequestBody {

    public JSONObject searchHotelsRequestBody(String checkIn, String checkOut, String placeId) {

        JSONObject roomsInfoJsonBody = new JSONObject();
        roomsInfoJsonBody.put("adultsCount", 2);

        JSONArray roomsInfoArray = new JSONArray();
        roomsInfoArray.put(roomsInfoJsonBody);

        JSONObject searchHotelJsonBody = new JSONObject();
        searchHotelJsonBody.put("checkIn", checkIn);
        searchHotelJsonBody.put("checkOut", checkOut);
        searchHotelJsonBody.put("roomsInfo", roomsInfoArray);
        searchHotelJsonBody.put("placeId", placeId);

        return searchHotelJsonBody;

    }
}
