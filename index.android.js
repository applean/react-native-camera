var { requireNativeComponent, PropTypes, View } = require('react-native');

var iface = {
  name: 'Camera',
  propTypes: {
    ...View.propTypes,
    src: PropTypes.string,
    borderRadius: PropTypes.number,
    resizeMode: PropTypes.oneOf(['cover', 'contain', 'stretch']),
  },
};

module.exports = requireNativeComponent('RCTCamera', iface);
