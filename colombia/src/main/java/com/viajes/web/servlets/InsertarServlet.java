package com.viajes.web.servlets;

import java.io.IOException;

import com.viajes.web.models.AccionesCliente;
import com.viajes.web.models.Cliente;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Servlet: clase Java que se ejecuta del lado del servidor, 
//que permite aceptar las peticiones de cliente, y realizar una tarea
//TAREAS posibles: 
// - generar una rta HTML 
// - llamar a otros servlets 
// - utilizar cookies y sesiones
// - enlace(controlador) entre cliente y BBDD

//dirige a determinada ruta en el browser
@WebServlet("/nuevocliente")
public class InsertarServlet extends HttpServlet {

    //en estos métodos, el servidor nos pasa dos objetos:
    //request: permite recibir info enviada por el cliente
    //response: permite responder al cliente

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Ejecutando nuevocliente en el navegador");

        String nombreCliente;
        String apellidoCliente;
        String contactoCliente;
        String comentariosCliente;

        nombreCliente = req.getParameter("nombre");
        apellidoCliente = req.getParameter("apellido");
        contactoCliente = req.getParameter("contacto");
        comentariosCliente = req.getParameter("comentarios");

        Cliente nuevoCliente = new Cliente();

        nuevoCliente.setNombre(nombreCliente);
        nuevoCliente.setApellido(apellidoCliente);
        nuevoCliente.setContacto(contactoCliente);
        nuevoCliente.setComentarios(comentariosCliente);

        int estado = AccionesCliente.registrarCliente(nuevoCliente);

        if(estado == 1){
            //redirigirá a una vista jsp
            resp.sendRedirect("exito.jsp");
        }else {
            resp.sendRedirect("error.jsp");
        }
    }
}
