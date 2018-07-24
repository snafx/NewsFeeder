import React, {Component} from 'react';
import MenuItem from '@material-ui/core/MenuItem';
import FormControl from '@material-ui/core/FormControl';
import Select from '@material-ui/core/Select';

const styles = theme => ({
  root: {
    display: 'flex',
    flexWrap: 'wrap'
  },
  formControl: {
    margin: theme.spacing.unit,
    minWidth: 200
  },
  selectEmpty: {
    marginTop: theme.spacing.unit * 2
  }
});

export default class SourcesFilter extends Component {
  constructor(props) {
    super(props)
  }

  change(event) {
    let {filter, updateFilter} = this.props;
    let updatedFiltered = filter;
    updatedFiltered.sources = event.target.value;
    updateFilter(updatedFiltered);
  }

  render() {
    let {sourcesList, filter} = this.props;

    let renderOptions = sourcesList.map((source, index) => {
      return (
        <MenuItem key={index} value={source.value}>{source.name}</MenuItem>
      )
    });

    return (
      <div className="form-group">
        <form className={styles.root} autoComplete="off">
          <FormControl className={styles.formControl}>
            <Select
              value={filter.sources}
              onChange={this.change.bind(this)}
              displayEmpty
              className={styles.selectEmpty}
            >
              <MenuItem value="">
                <em>{filter.sources}</em>
              </MenuItem>
              {renderOptions}
            </Select>
          </FormControl>
        </form>
      </div>
    )
  }
}
