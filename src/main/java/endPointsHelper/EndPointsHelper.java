package endPointsHelper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static constants.Constants.*;

public class EndPointsHelper {

    public static Map<String, String> headerWithToken(String token, String contentType) {
        Map<String, String> defaultHeaders = new HashMap<String, String>();
        defaultHeaders.put(TOKEN, token);
        defaultHeaders.put(CONTENT, CONTENT_TYPE_VALUE);
        return defaultHeaders;
    }

    public static Response postApiHelper(String apiUrl, String token, String contentType, JSONObject requestBody) {
        if (RequestValidator.isNotNullOrEmpty(apiUrl)) {
            return RestAssured.given().that().headers(headerWithToken(token, contentType)).body(requestBody.toString()).when().post(apiUrl).thenReturn();
        } else
            try {
                throw new InvalidRequestResponse("Invalid Request/Response");
            } catch (InvalidRequestResponse e) {
                e.printStackTrace();
            }
        return null;
    }

    public static Response getApiHelper(String url, String param, String paramValue) {
        if (RequestValidator.isNotNullOrEmpty(url)) {
            return RestAssured.given().that().param(param, paramValue).when().get(url);
        } else
            try {
                throw new InvalidRequestResponse("Invalid Request/Response");
            } catch (InvalidRequestResponse e) {
                e.printStackTrace();
            }
        return null;
    }

    public static String stringReturnJsonPath(Response ApiResponse, String ApiPath) {
        JsonPath jsonPathEvaluator = ApiResponse.jsonPath();
        String response = jsonPathEvaluator.get(ApiPath).toString();
        return response;

    }

}
