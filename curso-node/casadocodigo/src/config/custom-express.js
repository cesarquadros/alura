const express = require('express');
app = express();
module.exports = app;
const rotas = require('../app/rotas/rotas.js');
rotas(app);

require('marko/node-require').install();
require('marko/express');