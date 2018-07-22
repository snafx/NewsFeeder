package news.service;

import common.config.ConfigurationImpl;
import news.api.TopHeadlinesApi;
import news.api.TopHeadlinesApiBuilder;
import news.model.TopHeadlinesApiRequest;
import news.model.TopHeadlinesApiResponse;

public class TopHeadlinesApiService {

    public TopHeadlinesApiResponse getTopHeadlinesFromTopHeadlinesApi(TopHeadlinesApiRequest topHeadlinesApiRequest) {
        TopHeadlinesApi api = TopHeadlinesApiBuilder.create(new ConfigurationImpl()).build().createTarget();
        return api.getTopHeadlinesNews(topHeadlinesApiRequest);
    }
}
