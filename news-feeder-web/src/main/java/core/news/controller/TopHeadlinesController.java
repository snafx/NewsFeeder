package core.news.controller;

import javax.inject.Inject;

import common.exception.ServerException;
import common.rest.Response;
import core.news.action.GetTopHeadlinesAction;
import core.news.action.GetTopHeadlinesBySourceAction;
import news.api.NewsApi;
import news.model.NewsView;
import news.model.filter.FilterSources;

public class TopHeadlinesController implements NewsApi {

    @Inject
    private GetTopHeadlinesAction getTopHeadlinesAction;

    @Inject
    private GetTopHeadlinesBySourceAction getTopHeadlinesBySourceAction;

    @Override
    public Response<NewsView> getTopHeadlinesNews() throws ServerException {
        return getTopHeadlinesAction.execute();
    }

    @Override
    public Response<NewsView> getTopHeadlinesBySourceFilter(FilterSources filterSources) throws ServerException {
        getTopHeadlinesBySourceAction.setSourcesFilter(filterSources);
        return getTopHeadlinesBySourceAction.execute();
    }

}

