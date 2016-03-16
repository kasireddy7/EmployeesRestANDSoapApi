wsgen -cp bin -d bin com.ragz.ws.employee.EmployeeWebService
wsgen -s src -cp bin -d bin com.ragz.ws.employee.EmployeeWebService
wsimport -s src -d bin http://localhost:8080/EmployeesSoapApi/Employees?wsdl


http://theopentutorials.com/examples/java-ee/jax-ws/create-and-consume-web-service-using-jax-ws/

