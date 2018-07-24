package core.news.service;

import java.util.List;
import javax.inject.Inject;

import core.news.mapper.TopHeadlinesResponseToViewMapper;
import news.model.NewsView;
import news.model.TopHeadlinesApiRequest;
import news.model.TopHeadlinesApiResponse;
import news.model.filter.FilterSources;
import news.service.TopHeadlinesApiService;

public class TopHeadlinesBySourceService {

    @Inject
    private TopHeadlinesApiService topHeadlinesApiService;

    @Inject
    private TopHeadlinesResponseToViewMapper topHeadlinesResponseToViewMapper;

    public List<NewsView> getTopHeadlinesBySource(FilterSources filterSources) {
        TopHeadlinesApiResponse response = topHeadlinesApiService.getTopHeadlinesFromTopHeadlinesApi(prepareRequest(filterSources));
        return mapToView(response);
    }

    private TopHeadlinesApiRequest prepareRequest(FilterSources filterSources) {
        TopHeadlinesApiRequest request = new TopHeadlinesApiRequest();
        request.topHeadlinesSources = filterSources.sources;
        return request;
    }

    private List<NewsView> mapToView(TopHeadlinesApiResponse response) {
        return topHeadlinesResponseToViewMapper.mapToView(response);
    }
}
