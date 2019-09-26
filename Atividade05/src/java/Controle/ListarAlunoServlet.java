/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

@WebServlet(name = "ListarAlunoServlet", urlPatterns = {"/aluno"})
public class ListarAlunoServlet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Aluno> lista = new ArrayList<Aluno>();
        AlunoBO bo = new AlunoBO();

        try {
            lista = bo.listar();
        } catch (NegocioException ex) {
            throw new ServletException("", ex);
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title > Cadastro de Alunos </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Listagem de Alunos</h1>");
        
        out.println("<h1>Listagem de Alunos</h1>");
        out.println("<a href='" + response.encodeURL("/aluno/incluir") + "'>Incluir</a>");
        out.println("<table>");
        
        out.print("<table>");

        out.println("</tr>");

        for (Aluno aluno : lista) {
            out.println("<tr>");
            out.println("<td>" + aluno.getMatricula() + "</td>");
            out.println("<td>" + aluno.getMatricula() + "</td>");
            out.println("<td><a href=''>Alterar</a>");
            out.println("<a ref='\" + response.encodeURL(\"/aluno/excluir?id=\") + aluno.getId() + \"' onclick='return confirm('Deseja excluir o aluno?');>Excluir</a></td>");
            out.println("</tr>");
        }

        out.println("</table>");

        out.print("<tr>");
        out.print("<th>Matrícula</th>");
        out.print("<th>Nome</th>");
        out.print("<th>Ações</th>");
        out.print("</tr>");
        out.print("</table>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException{
            throw new ServletException("Método não suportado");
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
