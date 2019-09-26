/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

/**
 *
 * @author 18114290023
 */
@WebServlet(name = "IncluirAlunoServlet", urlPatterns = {"/aluno/incluir"})
public class IncluirAlunoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Cadastro de Alunos</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Incluir Aluno</h1>");
        out.print("<form action='/aluno/incluir' method = 'post'>");
        out.print("<div>");
        out.print("<label>Matrícula:</label>");
        out.print("<input type = 'text' name = 'matricula' size ='15'>");
        out.print("</div>");
        out.print("<div>");
        out.print("<label>Nome:</label>");
        out.print("<input type='text' name='nome' size='30'>");
        out.print("</div>");
        out.print("<input type='submit' value = 'Salvar'>");
        out.print("<a href='/aluno/listar'>Desistir</a>");
        out.print("<");
        out.print("</form>");
        out.print("</body>");
        out.print("</html>");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Aluno aluno = new Aluno();

        aluno.setMatricula(Integer.parseInt(request.getParameter("matricula")));
        aluno.setNome(request.getParameter("nome"));

        AlunoBO bo = new AlunoBO();

        try {
            bo.incluir(aluno);
        } catch (NegocioException e) {
            throw new ServletException("", e);
        }
        
        response.sendRedirect(request.getContextPath()+"/aluno");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
