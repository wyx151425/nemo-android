package com.rumofuture.nemo.model.entity;

/**
 * Created by WangZhenqi on 2018/1/1.
 */

public class Book extends NemoEntity {

    private User author;  // 所属漫画作者

    private String name;  // 名称
    private String style;  // 风格
    private String introduction;  // 简介
    private String sourceUrl;  // 资源地址
    private String coverUrl;  // 漫画册封面

    private Integer pageTotal;  // 漫画册漫画分页数
    private Integer favorTotal;  // 收藏此漫画的用户数

    private Integer status;  // 审核状态：0-禁用/1-审核中/2-审核通过
    private Integer type;  // 类型：0-原生/1-引用
    private Boolean open;  // 公开
    private Boolean copyright;  // 版权

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Integer getFavorTotal() {
        return favorTotal;
    }

    public void setFavorTotal(Integer favorTotal) {
        this.favorTotal = favorTotal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }
}
