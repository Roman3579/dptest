import _ from 'lodash';

const add = (first, second) => {
  return first + second;
};

const subtract = (first, second) => {
  return first - second;
};

const create_range = (start, end) => {
  return _.range(start, end);
}

const _add = add;
export { _add as add };
const _subtract = subtract;
export { _subtract as subtract };
const _create_range = create_range;
export { _create_range as create_range };