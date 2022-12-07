package com.example.snacksback.model;

import java.io.Serializable;
import java.util.List;

public class Goods implements Serializable {
    private Integer cid;

    private String cname;

    private String introduction;

    private String price;

    private Integer sid;

    private Integer inventory;

    private Integer lid;

    private Merchant merchant;

    private List<Image> imgUrl;

    private List<Comment> commentList;

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public List<Image> getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(List<Image> imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", introduction='" + introduction + '\'' +
                ", price='" + price + '\'' +
                ", sid=" + sid +
                ", inventory=" + inventory +
                ", lid=" + lid +
                ", merchant=" + merchant +
                ", imgUrl=" + imgUrl +
                ", commentList=" + commentList +
                '}';
    }
}