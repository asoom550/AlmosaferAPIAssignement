package constants;

public class Constants {
    public static final String CONTENT;
    public static final String CONTENT_TYPE_VALUE;
    public static final int EXPECTED_STATUS_CODE;
    public static final String TOKEN;
    public static final String PARAM;


    static {
        CONTENT = "Content-Type";
        CONTENT_TYPE_VALUE = "application/json";
        EXPECTED_STATUS_CODE = 200;
        TOKEN = "token";
        PARAM = "query";

    }

}
