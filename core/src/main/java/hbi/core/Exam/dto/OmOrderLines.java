package hbi.core.Exam.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 李璇 on 2017/1/10.
 */

@Table(name="hap_om_order_lines")
public class OmOrderLines extends BaseDTO {

    @Id
    @Column(name="line_id")
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long lineId;

    @Column(name="header_id")
    private Long headerId;

    @Column(name="line_number")
    private Long lineNumber;

    @Column(name="inventory_item_id")
    private Long inventoryItemId;

    @Column(name="orderd_quantity")
    private Long orderdQuantity;

    @Column(name="order_quantity_uom")
    private String orderQuantityUom;

    @Column(name="unit_selling_price")
    private Long unitSellingPrice;

    @Column(name="description")
    private String description;

    @Column(name="company_id")
    private Long companyId;

    @Column(name="addition1")
    private String addition1;

    @Column(name="addition2")
    private String addition2;

    @Column(name="addition3")
    private String addition3;

    @Column(name="addition4")
    private String addition4;

    @Column(name="addition5")
    private String addition5;

    @Column(name="request_id")
    private Long requestId;

    @Column(name="program_id")
    private Long programId;
    @Column(name="attribute_category")
    private String attributeCategory;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Long getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Long unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    @Override
    public Long getRequestId() {
        return requestId;
    }

    @Override
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    @Override
    public Long getProgramId() {
        return programId;
    }

    @Override
    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    @Override
    public String getAttributeCategory() {
        return attributeCategory;
    }

    @Override
    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    @Override
    public String toString() {
        return "OmOrderLines{" +
                "lineId=" + lineId +
                ", headerId=" + headerId +
                ", lineNumber=" + lineNumber +
                ", inventoryItemId=" + inventoryItemId +
                ", orderdQuantity=" + orderdQuantity +
                ", orderQuantityUom='" + orderQuantityUom + '\'' +
                ", unitSellingPrice=" + unitSellingPrice +
                ", description='" + description + '\'' +
                ", companyId=" + companyId +
                ", addition1='" + addition1 + '\'' +
                ", addition2='" + addition2 + '\'' +
                ", addition3='" + addition3 + '\'' +
                ", addition4='" + addition4 + '\'' +
                ", addition5='" + addition5 + '\'' +
                ", requestId=" + requestId +
                ", programId=" + programId +
                ", attributeCategory='" + attributeCategory + '\'' +
                '}';
    }
}
