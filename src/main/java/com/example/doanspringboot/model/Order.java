package com.example.doanspringboot.model;

import java.util.Date;

public class Order {
  private Integer id;
  private Integer transactionID;
  private String image;
  private String name;
  private Long amount;
  private Integer quantity;
  private Date created;
  private Date updated;
  private Integer status;
  private Integer isCanceled;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(Integer transactionID) {
    this.transactionID = transactionID;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
    this.updated = updated;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getIsCanceled() {
    return isCanceled;
  }

  public void setIsCanceled(Integer isCanceled) {
    this.isCanceled = isCanceled;
  }
}
