1) create an entity "Product" with
	int pid  [id]
	String pname
	int qty
	int price

Home.jsp  (should be the welcome page)
inside "Home.jsp",

two links

	add product
	view product

when user clicks on "add product", control goes to "Add.jsp" which will accept 
	product name , price and quantity
on click of "submit" , control goes to 	"AddServlet" which will use hibernate to persist the "Product" class instance inside database.
Now servlet will forward the request to "Home.jsp"

when user clicks on "view product", control goes to "ViewServlet" which will use hibernate to retrieve all the records from Product table.
servlet will get List which contains all the objects ( HQL )
store it inside request attribute and then forward request to "View.jsp".
View.jsp will display all the objects using jstl and el.
also in "View.jsp", there should be a link "go home" on click of which control should go back to "Home.jsp"



2) 
	generate an entity class "Dept" inside "mypack"
using reverse engg technique.


Data.jsp -> DataServlet 

	in jsp u need to have

	Search By loc:-  <textfield>

		<submit>

user will enter "location" and click on submit. Request will go to DataServlet , which will search records from database where location is  the one entered by user (using HQL). This will give a servlet List which will contain "Dept" objects for matching condition.

servlet will store this List inside "request" attribute and forward it to the same jsp i.e. "Data.jsp" from where u have come inside servlet.

Data.jsp will display the arraylist using EL.


3) create an entity "Student" with
	int rollno   [ id ]
	String name
	String address

create an interface

		StudentDAO with method
	void addStudent(Student)
	

create two implementations

	StudentDAOFileImpl.java
		which will persist given student inside file using serialization.

	StudentDAODataImpl.java
		which will persist given student inside database using hibernate.


Add.jsp

	Enter student name:
	Enter student address
		
		Select persistence store: dropdown
			with values

				file 
				database

		submit

on submit control should go to "AddServlet"

AddServlet will have a reference to 

	StudentDAO sdao;
the idea here is that "sdao" can point to any implementation of "StudentDAO" and invoke "addStudent()" polymorphically.

inside doPost() method 
a) instantiate "Student" with the values provided by user.
b) u will check the persistence store selected by user.
if this is "file"
	set the rollno.
	servlet will instantiate "StudentDAOFileImpl" and invoke "addStudent()" method.

if this is "data"
	servlet will instantiate "StudentDAODataImpl" and invoke "addStudent()" method.


4)create two entities "Course" and "Module"

Module
	id [auto generated]
	name
	

Course
	id [auto generated]
	name
	Set<Module> set;  // one to many

create a "Form.jsp"
	which will accept

Enter Course name:  
	Module_1:
	Module_2:
	Module_3:

		save

on click of "save" it should go to "CourseServ" which will create objects of "Course and Module". Add Module objects in Set and associate it with "Course" object. Finally it has to persist Course inside database using hibernate.

create "ShowServ",which will query database for getting Course objects.store them in ArrayList. add ArrayList inside "request" scope and forward to "Del.jsp". 
Del.jsp will retrieve all the objects from request scope , and show their name along with hyperlink "delete". if we click delete, control should go to "DelServ" which will delete that particular Course.

inside Del.jsp give hyperlink as

	<a href="Delserv? id=${var.id}"> delete</a>


 
