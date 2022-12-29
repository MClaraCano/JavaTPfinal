<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link rel="stylesheet" href="infocliente.css">
    <title>Ver Cliente</title>

</head>
<body>
    <section>
        <h1>Datos personales del Cliente</h1>

        <div class="container text-center">
            <div class="row">
              <div class="col">
                <img height="180px" id="cliente" src="img/clientePNG.png" alt="cliente">
              </div>
              <div class="col">
                <div id="datoscliente">
                    <p> <b> ID Cliente: </b> ${c.getId()}</p>
                    <p> <b> Nombre: </b> ${c.getNombre()}</p>
                    <p> <b> Apellido: </b> ${c.getApellido()}</p>
                    <p> <b> Contacto: </b> ${c.getContacto()}</p>
                    <p> <b> Comentarios: </b> ${c.getComentarios()}</p>
                </div>
              </div>
            </div>
        </div>
        
        <a id="enlace" href="index.html">Volver</a>
    </section>
</body>
</html>