1) index.jsp

	accept user name and password

	on submit control should go to "MainServ"

	"MainServ" will check if user name and password is "scott" and "tiger" respectively , it will forward to "Welcome.jsp" which will display welcome message.
if user name and password is not correct, "MainServ" will forward to "index.jsp".

2) in Module.jsp create <option> i.e. drop-down list.
values should be java,C++, Oracle.
when user selects, a particular option and click on submit button, request should go to servlet.
In servlet u read the request parameter.
if the value is "java" forward to j2se.jsp,
if the value is "C++" forward to cplusplus.jsp
if the value is "oracle" forward to ora.jsp

3)	create a table in MySQL "student" with 
	rollno int primary key
	name varchar
	age int
	address varchar

now create "Student.jsp"
	accept
		rollno
		name
		age
		address

	on submit control should go to "StudentServ".

		"StudentServ" will get the request parameters and add a record in database.

		this servlet also will query to the database
"select rollno from student" 
rollno retrieved from database will be added inside ArrayList.
ArrayList will be stored inside "request" attribute and finally servlet will forward the request to "Report.jsp"

"Report.jsp" will retrieve ArrayList from request attribute and display rollnos. here you have to use "forEach" tag of JSTL.

