module.exports = {
    SumExecutor: function() {
    }
};

module.exports.SumExecutor.prototype = {
    execute: function(value) {
        return value + 10;
    }
}