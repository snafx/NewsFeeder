import React, {Component} from 'react';
import 'whatwg-fetch';
import TopHeadlinesNewsCard from './TopHeadlinesNewsCard';
import Filter from '../filter/Filter';


const API_HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
};

export default class TopHeadlinesNewsContainer extends Component {
  constructor() {
    super(...arguments);
    this.state = {
      news: [],
      filter: {
        sources: 'TECHCRUNCH'
      }
    }
  }

  componentDidMount() {
    this.getData();
  }

  getData() {
    fetch('/news-feeder/api/news/by-source', {
      method: 'POST',
      headers: API_HEADERS,
      body: JSON.stringify(this.prepareRequest())
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
        console.log('Error while sending data', error)
      });
  }

  prepareRequest() {
    let request = this.state.filter;
    return request;
  }

  updateFilter(filterUpdated) {
    this.setState({
      filter: filterUpdated
    });
    console.log('filter', filterUpdated);
    this.getData();
  }

  render() {
    return (
      <div>
        <Filter value={this.state.filter} updateFilter={this.updateFilter.bind(this)}/>
        <TopHeadlinesNewsCard listNews={this.state.news}/>
      </div>
    )
  }
}
