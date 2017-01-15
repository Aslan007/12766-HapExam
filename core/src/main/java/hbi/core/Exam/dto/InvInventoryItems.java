package hbi.core.Exam.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 李璇 on 2017/1/10.
 */
@Table(name="hap_inv_inventory_items")
public class InvInventoryItems {

    @Id
    @Column(name="inventory_item_id")
    @GeneratedValue(
            generator = "IDENTITY"
    )
    private Long inventoryItemId;

    @Column(name="item_code")
    private String itemCode;

    @Column(name="item_uom")
    private String itemUom;

    @Column(name="item_description")
    private String itemDescription;

    @Column(name="order_flag")
    private String orderFlag;

    @Column(name="start_active_date")
    private Date startActiveDate;

    @Column(name="end_active_date")
    private Date endActiveDate;

    @Column(name="enabled_flag")
    private String enabledFlag;

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
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

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getOrderFlag() {
        return orderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        this.orderFlag = orderFlag;
    }

    public Date getStartActiveDate() {
        return startActiveDate;
    }

    public void setStartActiveDate(Date startActiveDate) {
        this.startActiveDate = startActiveDate;
    }

    public Date getEndActiveDate() {
        return endActiveDate;
    }

    public void setEndActiveDate(Date endActiveDate) {
        this.endActiveDate = endActiveDate;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    @Override
    public String toString() {
        return "InvInventoryItems{" +
                "inventoryItemId=" + inventoryItemId +
                ", itemCode='" + itemCode + '\'' +
                ", itemUom='" + itemUom + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", orderFlag='" + orderFlag + '\'' +
                ", startActiveDate=" + startActiveDate +
                ", endActiveDate=" + endActiveDate +
                ", enabledFlag='" + enabledFlag + '\'' +
                '}';
    }
}
