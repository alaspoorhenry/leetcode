/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    var n = x.toString();
    var res = n.split("");
    var b = 1;
    if (res[0] === '-') {
        b = -1;
        res = res.slice(1,res.length);
    }
    var ret = 0;
    for (var i = res.length - 1; i >= 0; i--) {
        ret += res[i]*(Math.pow(10,i));
    }
    if ((b === -1)&&(ret >= Math.pow(2,31))) {
        return 0;
    } else if (ret >= Math.pow(2,31)-1) {
        return 0;
    }
    return b*ret;
};
