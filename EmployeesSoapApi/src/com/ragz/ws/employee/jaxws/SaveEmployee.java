
package com.ragz.ws.employee.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "saveEmployee", namespace = "http://employee.ws.ragz.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveEmployee", namespace = "http://employee.ws.ragz.com/")
public class SaveEmployee {

    @XmlElement(name = "arg0", namespace = "")
    private com.ragz.vo.EmployeeVo arg0;

    /**
     * 
     * @return
     *     returns EmployeeVo
     */
    public com.ragz.vo.EmployeeVo getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.ragz.vo.EmployeeVo arg0) {
        this.arg0 = arg0;
    }

}
