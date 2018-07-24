package news.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import common.exception.ServerException;
import common.rest.Response;
import news.model.NewsView;
import news.model.filter.FilterSources;

@Path("/news")
public interface NewsApi {

    @GET
    @Path("/top")
    @Produces(MediaType.APPLICATION_JSON)
    Response<NewsView> getTopHeadlinesNews() throws ServerException;

    @POST
    @Path("/by-source")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response<NewsView> getTopHeadlinesBySourceFilter(FilterSources filterSources) throws ServerException;

}
