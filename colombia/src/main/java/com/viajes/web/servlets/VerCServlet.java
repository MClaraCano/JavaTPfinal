package com.viajes.web.servlets;

import java.io.IOException;

import com.viajes.web.models.AccionesCliente;
import com.viajes.web.models.Cliente;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/vercliente")
public class VerCServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int id  = Integer.parseInt(req.getParameter("idcliente"));

        Cliente registro = AccionesCliente.verCliente(id);

        req.setAttribute("c", registro);


        //Para permitir la transferencia de una petición HTTP a otro recurso, 
        //hay que obtener un objeto RequestDispatcher

        //El método getRequestDispatcher devuelve un objeto RequestDispatcher

        //presenta el path al que redirige la vista

        RequestDispatcher respuesta = req.getRequestDispatcher("infocliente.jsp");
        
        //foward activa la respuesta desde otro elemento del programa. 
        //Si es desde el mismo servlet, se usa el include
        respuesta.forward(req, resp);
    }
}
