import React, {Component} from 'react';
import TopHeadlinesNewsContainer from './news/TopHeadlinesNewsContainer';
import NavBar from './navbar/NavBar';
import PaperHeadline from './navigation/PaperHeadline';

export default class NewsFeeder extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
      <div>
        <NavBar/>
        <div className="container">
          <PaperHeadline/>
          <TopHeadlinesNewsContainer/>
        </div>
      </div>
    );
  }
}
