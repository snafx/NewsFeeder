package core.news.action;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import common.action.BaseAction;
import common.exception.ServerException;
import common.rest.Response;
import core.news.service.TopHeadlinesService;
import news.model.NewsView;

@RequestScoped
public class GetTopHeadlinesAction extends BaseAction<NewsView> {

    @Inject
    private TopHeadlinesService topHeadlinesService;

    @Override
    public Response<NewsView> execute() throws ServerException {
        createResponse();
        response.data = topHeadlinesService.getTopHeadlines();
        return response;
    }
}
