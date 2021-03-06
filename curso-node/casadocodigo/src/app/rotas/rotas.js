const db = require('../../config/database');
const LivroDao = require('../infra/livro-dao');

module.exports = (app) => {

    app.get('/', function(req, resp) {
        resp.send(
            `
                <html>
                    <head>
                        <meta charset="utf-8">
                    </head>
                    <body>
                        <h1> Casa do Código </h1>
                    </body> 
                </html>
            `
        );
    });

    app.get('/livros', function(req, resp) {

        const livroDao = new LivroDao(db);

        livroDao.lista(function(erro, resultados) {
    
            resp.marko(
                require('../views/livros/listagem/listagem.marko'),
                {
                    livros: resultados
                }
    
            );
    
        });
    });
}