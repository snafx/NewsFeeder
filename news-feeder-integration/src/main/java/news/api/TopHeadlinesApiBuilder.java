package news.api;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import common.config.Configuration;

public class TopHeadlinesApiBuilder {

    private Configuration configuration;
    private ResteasyClient resteasyClient;

    private TopHeadlinesApiBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public static TopHeadlinesApiBuilder create(Configuration configuration) {
        return new TopHeadlinesApiBuilder(configuration);
    }

    public TopHeadlinesApiBuilder build() {
        resteasyClient = new ResteasyClientBuilder().build();
        return this;
    }

    public TopHeadlinesApi createTarget() {
        return resteasyClient.target(configuration.getTopHeadlinesApiUrl()).proxy(TopHeadlinesApi.class);
    }
}
