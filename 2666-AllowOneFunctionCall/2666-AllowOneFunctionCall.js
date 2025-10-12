// Last updated: 2025/10/12 下午7:21:43
/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    if(JSON.stringify(obj).length <= 2) return true;
    else return false;
};