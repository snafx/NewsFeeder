import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import Avatar from '@material-ui/core/Avatar';
import Typography from '@material-ui/core/Typography';
import red from '@material-ui/core/colors/red';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import Button from '@material-ui/core/Button';
import Tooltip from '@material-ui/core/Tooltip';
import GradeIcon from '@material-ui/icons/Grade';
import ExpansionPanel from '@material-ui/core/ExpansionPanel';
import ExpansionPanelSummary from '@material-ui/core/ExpansionPanelSummary';
import ExpansionPanelDetails from '@material-ui/core/ExpansionPanelDetails';
import moment from 'moment';


const styles = theme => ({
  card: {
    maxWidth: 250
  },
  media: {
    height: 0,
    paddingTop: '56.25%'
  },
  actions: {
    display: 'flex'
  },
  expand: {
    transform: 'rotate(0deg)',
    transition: theme.transitions.create('transform', {
      duration: theme.transitions.duration.shortest
    }),
    marginLeft: 'auto'
  },
  expandOpen: {
    transform: 'rotate(180deg)'
  },
  avatar: {
    backgroundColor: red[500]
  }
});

class TopHeadlinesNewsCard extends Component {
  constructor(props) {
    super(props)
  }

  state = {expanded: false};

  handleExpandClick = () => {
    this.setState(state => ({expanded: !state.expanded}));
  };

  render() {
    let {listNews, classes} = this.props;

    let renderListNews = listNews.map((news, index) => {
      return (
        <div className="col-4 py-1" key={index}>
          <Card style={styles.card} justify="center">
            <CardHeader
              avatar={
                <Tooltip title={news.source} placement="top">
                  <Avatar aria-label="Top Article" className={classes.avatar}>
                    <GradeIcon/>
                  </Avatar>
                </Tooltip>
              }
              title={news.title}
              subheader={moment(news.publishedAt).format('LLL')}
            />
            <CardMedia
              className={classes.media}
              image={news.urlToImage}
              title={news.source}
            />
            <CardContent>
              <Typography component="p">{news.description}</Typography>
              <Typography align="right" component="i">by {news.author}</Typography>
            </CardContent>
            <ExpansionPanel>
              <ExpansionPanelSummary expandIcon={
                <Tooltip title="Show more" placement="left">
                  <ExpandMoreIcon/>
                </Tooltip>}>
              </ExpansionPanelSummary>
              <ExpansionPanelDetails>
                <Typography>
                  <Typography paragraph variant="body2">
                    This is an example of a short description:
                  </Typography>
                  <Typography paragraph>
                    {news.description}
                  </Typography>
                  <Typography paragraph>
                    {news.description}
                  </Typography>
                  <Button variant="contained" color="primary" href={news.url}>
                    Read more @ {news.source}
                  </Button>
                </Typography>
              </ExpansionPanelDetails>
            </ExpansionPanel>
          </Card>
        </div>
      )
    });

    return (
      <div className="row">
        {renderListNews}
      </div>
    )
  }
}

TopHeadlinesNewsCard.propTypes = {
  classes: PropTypes.object.isRequired
};

export default withStyles(styles)(TopHeadlinesNewsCard);
