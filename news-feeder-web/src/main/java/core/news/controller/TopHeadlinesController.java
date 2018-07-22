package core.news.controller;

import javax.inject.Inject;

import common.exception.ServerException;
import common.rest.Response;
import core.news.action.GetTopHeadlinesAction;
import news.api.NewsApi;
import news.model.NewsView;

public class TopHeadlinesController implements NewsApi {

    @Inject
    private GetTopHeadlinesAction getTopHeadlinesAction;

    //    @Override
    //    public Response<NewsView> getTopHeadlinesNews() throws ServerException {
    //        return getTopHeadlinesAction.execute();
    //    }

    //    @Override
    //    public TopHeadlinesApiResponse getTopHeadlinesNews(TopHeadlinesApiRequest request) throws ServerException {
    //        return getTopHeadlinesAction.execute();
    //    }

    @Override
    public Response<NewsView> getTopNews() throws ServerException {
        return getTopHeadlinesAction.execute();
    }
}

