package core.newsSources.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import common.enums.TopHeadlinesSources;
import core.newsSources.mapper.TopHeadlinesSourceToTopHeadlinesViewMapper;
import news.model.SourcesView;

public class SourcesService {

    public List<SourcesView> getAll() {
        TopHeadlinesSourceToTopHeadlinesViewMapper sourceMapper = TopHeadlinesSourceToTopHeadlinesViewMapper.create();
        return Arrays.stream(TopHeadlinesSources.values())
                     .map(topHeadlinesSources -> sourceMapper.topHeadlinesSource(topHeadlinesSources).map())
                     .collect(Collectors.toList());
    }

}
