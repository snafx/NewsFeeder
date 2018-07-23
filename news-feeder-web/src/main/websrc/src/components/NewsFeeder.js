import React, {Component} from 'react';
import TopHeadlinesNewsContainer from './news/TopHeadlinesNewsContainer';
import NavBar from './navbar/NavBar';

export default class NewsFeeder extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div>
        <NavBar/>
        <div className="container">
          <h2>Articles:</h2>
          <TopHeadlinesNewsContainer/>
        </div>
      </div>
    );
  }
}
