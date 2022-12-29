

<!-- JSP: Java Server Pages
Tecnología que permite crear páginas web dinámicas basadas en HTML y XML, entre otros 
Combina HTML con Java para que la web sea dinámica.
Requiere SERVIDOR WEB compatible con contenedores SERVLET, como Apache Tomcat-->

<!-- Instrucción que caracteriza a un JSP: -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!-- el jsp permite mostrar con formato web la respuesta que da el servlet
Anteriormente, desde el servlet se escribía con formato HTML -->

<!DOCTYPE html>
<html lang="en">
<head>
    <!-- se cambió el 1° meta HTML. Se agregaron cosas al inicio -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Error</title>
    <link rel="stylesheet" href="erroryexito.css">
</head>

<body>
    <section>
        <h1>Se encontró un error en el guardado del nuevo cliente</h1>
        <a href="index.html">Volver</a>
    </section>
</body>
</html>