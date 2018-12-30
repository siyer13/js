var mysql = require('mysql');
var express = require('express');
var connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'password',
  database: 'Person'
});
var app = express();

connection.connect(function(err) {
  if(!err) {
    console.log('Database connected.....');
  } else {
    console.log('Error connecting to database.')
  }
});

app.get("/",function(req,res) {
  connection.query('SELECT * FROM address', function(err,rows,fields) {
  connection.end();
    if(!err) {
      console.log('Result: ',rows);
    }
    else {
      console.log('Error while performing query. ');
    }
  });
});

app.listen(3800);
