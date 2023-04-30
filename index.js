const _ = require('lodash')

const add = (first, second) => {
  return first + second;
};

const subtract = (first, second) => {
  return first - second;
};

const create_range = (start, end) => {
  return _.range(start, end);
}

module.exports.add = add;
module.exports.subtract = subtract;
module.exports.create_range = create_range;
