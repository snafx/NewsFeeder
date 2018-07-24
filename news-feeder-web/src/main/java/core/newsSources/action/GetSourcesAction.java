package core.newsSources.action;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import common.action.BaseAction;
import common.exception.ServerException;
import common.rest.Response;
import core.newsSources.service.SourcesService;
import news.model.SourcesView;

@RequestScoped
public class GetSourcesAction extends BaseAction<SourcesView> {

    @Inject
    private SourcesService sourcesService;

    @Override
    public Response<SourcesView> execute() throws ServerException {
        createResponse();
        response.data = sourcesService.getAll();
        return response;
    }
}
