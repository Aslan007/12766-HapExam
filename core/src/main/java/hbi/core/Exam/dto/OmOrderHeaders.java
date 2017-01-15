package hbi.core.Exam.dto;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import org.springframework.ldap.odm.annotations.Transient;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 李璇 on 2017/1/10.
 */
@ExtensionAttribute(disable = true)
@Table(name="hap_om_order_headers")
public class OmOrderHeaders {

    @Id
    @Column(name="header_id")
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long headerId;

    @Column(name="order_number")
    private String orderNumber;

    @Column(name="company_id")
    private Long companyId;

    @Column(name="order_date")
    private Date orderDate;

    @Column(name="order_status")
    private String orderStatus;

    @Column(name="customer_id")
    private Long customerId;

    @Transient
    private String companyName;

    @Transient
    private String customerName;

    @Transient
    private long Money;

    @Transient
    private long  unitSellingPrice;

    @Transient
    private long orderQuantity;

    public long getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(long itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Transient
    private long itemDescription;
    @Transient
    private int page;

    @Transient
    private int pagesize;

    @Transient
    private Long inventoryItemId;

    @Transient
    private String itemCode;

    @Transient
    private String itemUom;

    @Transient
    private Long orderdQuantity;
    @Transient
    private String description;
//    @Transient
//    private OmOrderLines lines;



    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemUom() {
        return itemUom;
    }

    public void setItemUom(String itemUom) {
        this.itemUom = itemUom;
    }

    public Long getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(Long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public OmOrderLines getLines() {
//        return lines;
//    }
//
//    public void setLines(OmOrderLines lines) {
//        this.lines = lines;
//    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getMoney() {
        return Money;
    }

    public void setMoney(long money) {
        Money = money;
    }

    public long getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(long unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public long getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(long orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "OmOrderHeaders{" +
                "headerId=" + headerId +
                ", orderNumber='" + orderNumber + '\'' +
                ", companyId=" + companyId +
                ", orderDate=" + orderDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", customerId=" + customerId +
                ", companyName='" + companyName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", Money=" + Money +
                ", unitSellingPrice=" + unitSellingPrice +
                ", orderQuantity=" + orderQuantity +
                ", itemDescription=" + itemDescription +
                ", page=" + page +
                ", pagesize=" + pagesize +
                ", inventoryItemId=" + inventoryItemId +
                ", itemCode='" + itemCode + '\'' +
                ", itemUom='" + itemUom + '\'' +
                ", orderdQuantity=" + orderdQuantity +
                ", description='" + description + '\'' +
                '}';
    }
}
