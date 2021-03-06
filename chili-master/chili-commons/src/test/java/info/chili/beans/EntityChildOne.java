package info.chili.beans;

import java.util.Date;

public class EntityChildOne {

    protected Long id;
    protected String childOneName;
    protected Date childDate;
    protected EntityChildOne childOne;
    protected EntityType type;
    protected EntitySuper entitySuper;

    public EntityChildOne() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChildOneName() {
        return childOneName;
    }

    public void setChildOneName(String childOneName) {
        this.childOneName = childOneName;
    }

    public Date getChildDate() {
        return childDate;
    }

    public void setChildDate(Date childDate) {
        this.childDate = childDate;
    }

    public EntityChildOne getChildOne() {
        return childOne;
    }

    public void setChildOne(EntityChildOne childOne) {
        this.childOne = childOne;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }

    public EntitySuper getEntitySuper() {
        return entitySuper;
    }

    public void setEntitySuper(EntitySuper entitySuper) {
        this.entitySuper = entitySuper;
    }
}
