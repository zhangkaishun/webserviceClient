
package cn.com.ssii;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sendLaStoreHouse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="sendLaStoreHouse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ssii.com/}laStoreHourseStr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendLaStoreHouse", propOrder = {
    "laStoreHourseStr"
})
public class SendLaStoreHouse {

    @XmlElement(namespace = "http://www.ssii.com/")
    protected String laStoreHourseStr;

    /**
     * ��ȡlaStoreHourseStr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaStoreHourseStr() {
        return laStoreHourseStr;
    }

    /**
     * ����laStoreHourseStr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaStoreHourseStr(String value) {
        this.laStoreHourseStr = value;
    }

}
