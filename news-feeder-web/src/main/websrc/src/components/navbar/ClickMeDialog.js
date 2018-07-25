import React from 'react';
import Button from '@material-ui/core/Button';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';
import Tooltip from '@material-ui/core/Tooltip';

class AlertDialog extends React.Component {
  state = {
    open: false,
  };

  handleClickOpen = () => {
    this.setState({ open: true });
  };

  handleClose = () => {
    this.setState({ open: false });
  };

  render() {
    return (
      <div>
        <Button onClick={this.handleClickOpen} color="">CLICK ME!</Button>
        <Dialog
          open={this.state.open}
          onClose={this.handleClose}
          aria-labelledby="alert-dialog-title"
          aria-describedby="alert-dialog-description"
        >
          <DialogTitle id="alert-dialog-title">{"Do you like it?"}</DialogTitle>
          <DialogContent>
            <DialogContentText id="alert-dialog-description">
              If you like this application, please contact me so we can discuss our future together.
            </DialogContentText>
          </DialogContent>
          <DialogActions>
            <Tooltip title="Are you sure?" placement="top-start">
            <Button onClick={this.handleClose} color="default">
              Disagree
            </Button>
            </Tooltip>
            <Tooltip title="Yay... Great decision!" placement="top-end">
            <Button onClick={this.handleClose} color="primary">
              Agree
            </Button>
            </Tooltip>
          </DialogActions>
        </Dialog>
      </div>
    );
  }
}

export default AlertDialog;
