package news.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import common.exception.ServerException;
import common.rest.Response;
import news.model.SourcesView;

@Path("/sources")
public interface SourcesApi {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    Response<SourcesView> getAllSources() throws ServerException;
}
