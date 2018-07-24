package core.news.action;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import common.action.BaseAction;
import common.exception.ServerException;
import common.rest.Response;
import core.news.service.TopHeadlinesBySourceService;
import news.model.NewsView;
import news.model.filter.FilterSources;

@RequestScoped
public class GetTopHeadlinesBySourceAction extends BaseAction<NewsView> {

    @Inject
    private TopHeadlinesBySourceService topHeadlinesBySourceService;

    private FilterSources filterSources;

    @Override
    public Response<NewsView> execute() throws ServerException {
        createResponse();
        response.data = topHeadlinesBySourceService.getTopHeadlinesBySource(filterSources);
        return response;
    }

    public void setSourcesFilter(FilterSources filterSources) {
        this.filterSources = filterSources;
    }
}
