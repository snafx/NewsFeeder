package core.news.service;

import java.util.List;
import javax.inject.Inject;

import core.news.mapper.TopHeadlinesResponseToViewMapper;
import news.model.NewsView;
import news.model.TopHeadlinesApiRequest;
import news.model.TopHeadlinesApiResponse;
import news.service.TopHeadlinesApiService;

public class TopHeadlinesService {

    @Inject
    private TopHeadlinesApiService topHeadlinesApiService;

    @Inject
    private TopHeadlinesResponseToViewMapper topHeadlinesResponseToViewMapper;

    public List<NewsView> getTopHeadlines() {
        TopHeadlinesApiResponse response = topHeadlinesApiService.getTopHeadlinesFromTopHeadlinesApi(prepareRequest());
        return mapToView(response);
    }

    private TopHeadlinesApiRequest prepareRequest() {
        TopHeadlinesApiRequest request = new TopHeadlinesApiRequest();
        request.sources = "cnbc";
        return request;
    }

    private List<NewsView> mapToView(TopHeadlinesApiResponse newsResponse) {
        return topHeadlinesResponseToViewMapper.mapToView(newsResponse);
    }
}
