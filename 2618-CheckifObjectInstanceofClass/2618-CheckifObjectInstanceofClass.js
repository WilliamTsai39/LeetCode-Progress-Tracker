// Last updated: 2025/10/12 下午7:01:03
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let res=[];
    for(let i = 0; i < arr.length; i++){
        if(fn(arr[i], i)){
            res.push(arr[i]);
        }
    }
    return res;
};