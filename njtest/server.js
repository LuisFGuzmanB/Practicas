/* incluir la biblioteca HTTP  */
var http = require('http');

/* Crea  HTTP server para manejar respuestas */

http.createServer(function(request, response) {
    response.writeHead(200, { 'Content-Type': 'text/plain' });
    response.write('Hola mundo');
    response.end();
}).listen(8888);