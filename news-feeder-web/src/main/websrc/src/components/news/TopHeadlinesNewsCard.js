import React, {Component} from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import classnames from 'classnames';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import Collapse from '@material-ui/core/Collapse';
import Avatar from '@material-ui/core/Avatar';
import IconButton from '@material-ui/core/IconButton';
import Typography from '@material-ui/core/Typography';
import red from '@material-ui/core/colors/red';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import Button from '@material-ui/core/Button';
import Tooltip from '@material-ui/core/Tooltip';
import GradeIcon from '@material-ui/icons/Grade';
import Divider from '@material-ui/core/Divider';


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
              subheader={news.publishedAt}
            />
            <CardMedia
              className={classes.media}
              image={news.urlToImage}
              title={news.source}
            />
            <CardContent>
              <Typography component="p">{news.description}</Typography>
              <Divider/>
              <Typography align="right" component="i">by {news.author}</Typography>
            </CardContent>
            <CardActions className={classes.actions} disableActionSpacing>
              <Tooltip title="Show more" placement="left-start">
                <IconButton
                  className={classnames(classes.expand, {
                    [classes.expandOpen]: this.state.expanded,
                  })}
                  onClick={this.handleExpandClick}
                  aria-expanded={this.state.expanded}
                  aria-label="show more"
                >
                  <ExpandMoreIcon/>
                </IconButton>
              </Tooltip>
            </CardActions>
            <Collapse in={this.state.expanded} timeout="auto" unmountOnExit>
              <CardContent>
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
              </CardContent>
            </Collapse>
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
  classes: PropTypes.object.isRequired,
};

export default withStyles(styles)(TopHeadlinesNewsCard);
