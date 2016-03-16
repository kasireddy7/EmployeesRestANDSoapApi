
package com.ragz.ws.employee.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllEmployeesResponse", namespace = "http://employee.ws.ragz.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllEmployeesResponse", namespace = "http://employee.ws.ragz.com/")
public class GetAllEmployeesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.ragz.vo.EmployeeVo> _return;

    /**
     * 
     * @return
     *     returns List<EmployeeVo>
     */
    public List<com.ragz.vo.EmployeeVo> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.ragz.vo.EmployeeVo> _return) {
        this._return = _return;
    }

}
