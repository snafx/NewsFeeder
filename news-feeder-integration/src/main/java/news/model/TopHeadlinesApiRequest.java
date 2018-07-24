package news.model;

import javax.ws.rs.QueryParam;

import common.enums.TopHeadlinesSources;

public class TopHeadlinesApiRequest {

    @QueryParam("sources")
    public String sources = "cnn";

    @QueryParam("sources")
    public TopHeadlinesSources topHeadlinesSources;

    @QueryParam("apiKey")
    public String apiKey = "0b9901c19f8e434da3c29b63ac1a7036";
}
