import React, {Component} from 'react';
import SourcesFilterContainer from './sources/SourcesFilterContainer';

export default class Filter extends Component {
  constructor(props) {
    super(props)
  }

  render() {
    let {value, updateFilter} = this.props;

    return (
      <div className="row">
        <div className="col-12">
          <SourcesFilterContainer filter={value} updateFilter={updateFilter}/>
        </div>
      </div>
    )
  }
}
