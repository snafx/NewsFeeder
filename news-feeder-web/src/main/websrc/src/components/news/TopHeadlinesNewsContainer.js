import React, {Component} from 'react';
import 'whatwg-fetch';
import TopHeadlinesNewsCard from './TopHeadlinesNewsCard';


const API_HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
};

export default class TopHeadlinesNewsContainer extends Component {
  constructor() {
    super(...arguments);
    this.state = {
      news: []
    }
  }

  componentDidMount() {
    this.getData();
  }

  getData() {
    fetch('/news-feeder/api/news/top', {
      method: 'GET',
      headers: API_HEADERS
    })
      .then((response) => response.json())
      .then((responseData) => {
        let newsUpdated = this.state.news;
        newsUpdated = responseData.data;
        console.log('news', responseData);
        this.setState({
          news: newsUpdated
        });
      })
      .catch((error) => {
        console.log('Error while retrieving data', error)
      });
  }

  render() {
    return (
      <div>
        <TopHeadlinesNewsCard listNews={this.state.news}/>
      </div>
    )
  }
}
