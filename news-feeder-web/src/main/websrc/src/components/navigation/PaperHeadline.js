import React from 'react';
import PropTypes from 'prop-types';
import {withStyles} from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import Typography from '@material-ui/core/Typography';

const styles = theme => ({
  root: {
    ...theme.mixins.gutters(),
    paddingTop: theme.spacing.unit * 3,
    paddingBottom: theme.spacing.unit * 3,
    marginTop: theme.spacing.unit * 2,
    marginBottom: theme.spacing.unit * 2
  }
});

function PaperSheet(props) {
  const {classes} = props;

  return (
    <div>
      <Paper className={classes.root} elevation={1}>
        <Typography variant="headline" component="h2">
          ARTICLES
        </Typography>
        <Typography component="p">
          PLEASE CHOOSE PUBLISHER
        </Typography>
      </Paper>
    </div>
  );
}

PaperSheet.propTypes = {
  classes: PropTypes.object.isRequired
};

export default withStyles(styles)(PaperSheet);
