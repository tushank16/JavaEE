### Contains the Following 3 files 
# Person Class

with 2 member variables, setter and gettter methods and toString method overridden

# PersonServ Servlet
it contains a list
```
List<Person>personlist=new ArrayList<Person>();
personlist.add(p1);
personlist.add(p2);
```

the Result is then stored in Request.setattribute and forwarded to Result.jsp

# Result.jsp
Result.jsp which will access above list using "forEach". ( i.e. EL and JSTL )

