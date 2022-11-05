"use strict";
exports.__esModule = true;
var axios_1 = require("axios");
var url = 'https://jsonplaceholder.typicode.com/todos/2';
axios_1["default"].get(url)
    .then(function (res) { return (console.log(res.data)); })["catch"](function (err) { return (console.log(err)); });
