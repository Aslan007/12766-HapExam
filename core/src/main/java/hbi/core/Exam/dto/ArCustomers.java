package hbi.core.Exam.dto;

import com.hand.hap.mybatis.annotation.Condition;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 李璇 on 2017/1/10.
 */

@Table(name="hap_ar_customers")
public class ArCustomers {
    @Id
    @Column(name= "customer_id")
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long customerId;

    @Column(name="customer_number")
    private String customerNumber;

    @Column(name="customer_name")
    @Condition(operator = "LIKE")
    private String customerName;

    @Column(name="company_id")
    private Long companyId;

    @Column(name="enabled_flag")
    private String enabledFlag;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
    @Override
    public String toString() {
        return "ArCustomers{" +
                "customerId=" + customerId +
                ", customerNumber='" + customerNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", companyId=" + companyId +
                ", enabledFlag='" + enabledFlag + '\'' +
                '}';
    }
}
