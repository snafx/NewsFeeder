import React, {Component} from 'react';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';

export default class NavBar extends Component {
constructor(props) {
    super(props);
    this.state = {
      open: false
    };
  }

  render() {
    return (
      <div>
        <AppBar position="static" color="default">
          <Toolbar>
            <IconButton className={'fa fa-2x fa-chevron-circle-right'} disabled={true}/>
            <Typography variant="title" color="inherit">
              Top Headlines News Feeder
            </Typography>
            <IconButton className={'fa fa-2x fa-chevron-circle-left'} disabled={true}/>
              <Button variant="contained">
                HELLO!
              </Button>
            </Toolbar>
        </AppBar>
      </div>
    );
  }
}
