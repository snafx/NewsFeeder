import React, {Component} from 'react';
import 'whatwg-fetch';
import SourcesFilter from './SourcesFilter';

const API_HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
};

export default class SourcesFilterContainer extends Component {
  constructor(props) {
    super(...arguments);
    this.state = {
      sourcesList: []
    }
  }

  componentDidMount() {
    this.getData();
  }

  getData() {
    fetch('/news-feeder/api/sources/all', {
      method: 'GET',
      headers: API_HEADERS
    })
      .then((response) => response.json())
      .then((responseData) => {
        let sourceListUpdated = this.state.sourcesList;
        sourceListUpdated = responseData.data;
        this.setState({
          sourcesList: sourceListUpdated
        });
      })
      .catch((error) => {
        console.log('Error while retrieving data', error)
      });
  }

  render() {
    let {filter, updateFilter} = this.props;

    return (
      <SourcesFilter sourcesList={this.state.sourcesList} filter={filter} updateFilter={updateFilter}/>
    )
  }
}
