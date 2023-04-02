package constants;

public class EndPointsUrls {

    public static final String HOST;
    public static final String FILTER_HOTELS_API;
    public static final String GET_FLIGHTS_API;

    static {
        HOST = "https://www.almosafer.com/";

        GET_FLIGHTS_API = HOST + "api/v3/flights/flight/search";

        FILTER_HOTELS_API = HOST + "api/enigma/search/async";


    }
}
