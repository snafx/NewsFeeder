package core.newsSources.controller;

import javax.inject.Inject;

import common.exception.ServerException;
import common.rest.Response;
import core.newsSources.action.GetSourcesAction;
import news.api.SourcesApi;
import news.model.SourcesView;

public class SourcesController implements SourcesApi {

    @Inject
    private GetSourcesAction getSourcesAction;

    @Override
    public Response<SourcesView> getAllSources() throws ServerException {
        return getSourcesAction.execute();
    }
}
