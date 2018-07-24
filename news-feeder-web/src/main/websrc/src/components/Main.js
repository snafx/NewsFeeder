import React, {Component} from 'react';
import NewsFeeder from './NewsFeeder';
import {loadCSS} from 'fg-loadcss/src/loadCSS';
import CssBaseline from '@material-ui/core/CssBaseline';


export default class Main extends Component {

  componentDidMount() {
    loadCSS(
      'https://use.fontawesome.com/releases/v5.1.0/css/all.css',
      document.querySelector('#insertion-point-jss'),
    );
  }

  render() {
    return (
      <div>
        <CssBaseline/>
        <NewsFeeder/>
      </div>
    )
  }
}
