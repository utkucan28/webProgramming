package Forms;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Send
 */
@WebServlet("/Send")
public class Forms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forms() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
		String docType="<!DOCTYPE html>";
		String title= request.getParameter("s1")+" "+request.getParameter("s2")+" "+" KÝÞÝSÝNÝN BÝLGÝLERÝ";
		PrintWriter out = response.getWriter();
		out.println(docType +
				"<html>\n"+
				"<head>"+
				"<TITLE>"+title + "</TITLE>\n"+
				"<BODY BGCOLOR=\"#FDF5E6\">\n" +
				"<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
				"<meta charset=\"utf-8\">"+
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+
				"<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">"+
		 		"<table align=\"center\" class=\"table table-bordered\" id=\"sonuc_table\">"+
		 		"<thead>"+
		      		"<tr>"+
		      		"<th>Özellikler</th>"+
		      		"<th>Bilgiler</th>"+
		      		"</tr>"+
		      	"</thead>"+
		    "<tbody>"+
		      "<tr>"+
		        "<td>Ad:</td>"+
		        "<td>"+request.getParameter("s1")+"</td>"+
		      "</tr>"+
		      "<tr>"+
		        "<td>Soyad:</td>"+
		        "<td>"+request.getParameter("s2")+"</td>"+
		      "</tr>"+
		      "<tr>"+
		        "<td>Doðum Tarihi:</td>"+
		        "<td>"+ request.getParameter("s3") +"</td>"+
		      "</tr>"+
		      "<tr>"+
		        "<td>Telefon Numarasý:</td>"+
		        "<td>"+request.getParameter("s4")+"</td>"+
		      "</tr>"+
		      "<tr>"+
		        "<td>Öðrenim Durumu</td>"+
		        "<td>ÝLKOKUL"+request.getParameter("ilkokul")+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>ORTAOKUL"+request.getParameter("ortaokul")+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>LÝSE"+request.getParameter("lise")+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>ÜNÝVERSÝTE"+request.getParameter("üniversite")+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>ÜNÝVERSÝTE MEZUN"+request.getParameter("üni_mezun")+"</td>"+
		        "</tr>"+
		      "<tr>"+  
		      "<tr>"+
		        "<td>Cinsiyet:</td>"+
		        "<td>Erkek:"+request.getParameter("erkek")+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>Bayan:"+request.getParameter("bayan")+"</td>"+
		        "</tr>"+
		        "<td>Yetenekler:</td>"+
		        "<td>Android Bilgisi:"+request.getParameter("matlab")+
		        "<tr>"+"<td></td>"+
		        "<td>Java Bilgisi:"+request.getParameter("photoshop")+"</td>\n"+
		        "</tr>"+"<tr>"+"<td></td>"+
		        "<td>Jsp&Servlet Bilgisi:"+request.getParameter("unity")+"</td>\n"+
		        "</tr>"+"<tr>"+"<td></td>"+
		        "<tr>"+
		        "<td>Headers:</td>"+
		        "<td>Method"+request.getMethod()+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>Request URI:"+request.getRequestURI()+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>Protocol"+request.getProtocol()+"</td>"+
		        "<tr>"+"<td></td>"+
		        "<td>Header Names:"+request.getHeaderNames()+"</td>"+
		        "<tr>"+"<td></td>"+
		        "</tr>"
		       +"</tbody>"+
		  "</table>"+
		"</div>"+
		"</BODY></HTML>");
         
 }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
