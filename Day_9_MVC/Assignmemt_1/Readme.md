
		Form.html  action method=get   

Enter Qualification : <textfield>  qualification

		submit  



		CareerServ  [ Controller ]

		doGet
			get the value from "qualification"
		
		invoke "getAdvice()" of CareerExpert class

		collect the string given by above method
		store it inside "request" attribute 
		forward the request to "CareerDetails.jsp".



		CareerExpert - pojo   [ Model ]

	public String getAdvice(String qualification)
		if(qualification.equalsIgnoreCase("be")
			return "DAC course";




		CareerDetails.jsp   [ View ]

		retrieve the string (advice) from request attribute and display it ( as a response )


