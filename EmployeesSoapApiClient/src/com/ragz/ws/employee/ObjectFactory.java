
package com.ragz.ws.employee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ragz.ws.employee package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveEmployee_QNAME = new QName("http://employee.ws.ragz.com/", "saveEmployee");
    private final static QName _GetAllEmployees_QNAME = new QName("http://employee.ws.ragz.com/", "getAllEmployees");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://employee.ws.ragz.com/", "getAllEmployeesResponse");
    private final static QName _SaveEmployeeResponse_QNAME = new QName("http://employee.ws.ragz.com/", "saveEmployeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ragz.ws.employee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveEmployeeResponse }
     * 
     */
    public SaveEmployeeResponse createSaveEmployeeResponse() {
        return new SaveEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetAllEmployees }
     * 
     */
    public GetAllEmployees createGetAllEmployees() {
        return new GetAllEmployees();
    }

    /**
     * Create an instance of {@link GetAllEmployeesResponse }
     * 
     */
    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    /**
     * Create an instance of {@link SaveEmployee }
     * 
     */
    public SaveEmployee createSaveEmployee() {
        return new SaveEmployee();
    }

    /**
     * Create an instance of {@link EmployeeVo }
     * 
     */
    public EmployeeVo createEmployeeVo() {
        return new EmployeeVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee.ws.ragz.com/", name = "saveEmployee")
    public JAXBElement<SaveEmployee> createSaveEmployee(SaveEmployee value) {
        return new JAXBElement<SaveEmployee>(_SaveEmployee_QNAME, SaveEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee.ws.ragz.com/", name = "getAllEmployees")
    public JAXBElement<GetAllEmployees> createGetAllEmployees(GetAllEmployees value) {
        return new JAXBElement<GetAllEmployees>(_GetAllEmployees_QNAME, GetAllEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee.ws.ragz.com/", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://employee.ws.ragz.com/", name = "saveEmployeeResponse")
    public JAXBElement<SaveEmployeeResponse> createSaveEmployeeResponse(SaveEmployeeResponse value) {
        return new JAXBElement<SaveEmployeeResponse>(_SaveEmployeeResponse_QNAME, SaveEmployeeResponse.class, null, value);
    }

}
