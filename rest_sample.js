var express = require('express');
var bodyParser = require('body-parser');


var app = express()

app.use(bodyParser.json()); // support json encoded bodies
app.use(bodyParser.urlencoded({ extended: true })); // support encoded bodies

app.get("/account",function(request,response)
   {
     var student = {name:"xyz",class:"computers"};

    //  response.status(404);
      response.json(200,student);

  //response.second(student);
}) ;

app.post("/account",function(request,response)
   {
  //   var student = {name:"xyz",class:"computers"};

    //  response.status(404);
  //    response.json(request.body);

  response.send(request.body);
}) ;

app.listen("8090");
