		Trial1 - doGet
request.setAttribute("book","java");

	
		Trial2 - doGet
pw.println(request.getAttribute("book");
first run "Trial1" and then "Trial2". You should get null.

			Trial3
request.setAttribute("book","java");
// create RequestDispatcher
rd.forward(request,response);
	
			Trial4
pw.println(request.getAttribute("book");
first run "Trial3" and You should get "java"


			Trial5
request.setAttribute("book","java");
response.sendRedirect("Trial6");
	
			Trial6
pw.println(request.getAttribute("book");
first run "Trial5" and You should get null.

		Trial7
ServletContext context=getServletContext();
context.setAttribute("database","oracle");
	
	
		Trial8
ServletContext context=getServletContext();	
pw.println(context.getAttribute("database");


first run "Trial7",then "Trial8" . You should get "oracle".

now stop the tomcat and run "Trial8" , you will get null
