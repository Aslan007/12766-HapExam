package hbi.core.Exam.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 李璇 on 2017/1/10.
 */

@Table(name="hap_org_companys")
public class OrgCompanys{
    @Id
    @Column(name="company_id")
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long companyId;

    @Column(name="company_number")
    private String companyNumber;

    @Column(name="company_name")
    private String companyName;

    @Column(name="enabled_Flag")
    private String enabledFlag;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    @Override
    public String toString() {
        return "OrgCompanys{" +
                "companyId=" + companyId +
                ", companyNumber='" + companyNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                ", enabledFlag='" + enabledFlag + '\'' +
                '}';
    }
}
