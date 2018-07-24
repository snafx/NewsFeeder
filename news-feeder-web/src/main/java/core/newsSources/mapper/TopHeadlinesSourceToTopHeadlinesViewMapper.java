package core.newsSources.mapper;

import common.enums.TopHeadlinesSources;
import news.model.SourcesView;

public class TopHeadlinesSourceToTopHeadlinesViewMapper {

    private TopHeadlinesSources topHeadlinesSources;

    private TopHeadlinesSourceToTopHeadlinesViewMapper() {
    }

    public static TopHeadlinesSourceToTopHeadlinesViewMapper create() {
        return new TopHeadlinesSourceToTopHeadlinesViewMapper();
    }

    public TopHeadlinesSourceToTopHeadlinesViewMapper topHeadlinesSource(TopHeadlinesSources source) {
        this.topHeadlinesSources = source;
        return this;
    }

    public SourcesView map() {
        SourcesView sourcesView = new SourcesView();
        sourcesView.value = topHeadlinesSources.name();
        sourcesView.name = topHeadlinesSources.getSource();
        return sourcesView;
    }

}
