module.exports = {
    ModuloExecutor: function() {
    }
};

module.exports.ModuloExecutor.prototype = {
    execute : function(value) {
        return value % 123;
    }
}