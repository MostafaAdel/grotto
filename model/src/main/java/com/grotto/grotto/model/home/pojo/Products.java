package com.grotto.grotto.model.home.pojo;
// Generated Apr 29, 2015 1:19:13 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Products generated by hbm2java
 */
@Entity
@Table(name="products"
    ,catalog="mydb"
)
public class Products  extends AbstractPojo<Products, Integer> implements java.io.Serializable{


     private Integer id;
     private String productName;
     private String uuid;
    private Set<ProductBrands> productBrandses = new HashSet<ProductBrands>(0);

    public Products() {
    }

    public Products(String productName, String uuid, Set productBrandses) {
       this.productName = productName;
       this.uuid = uuid;
       this.productBrandses = productBrandses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="product_name", length=45)
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    @Column(name="uuid", length=100)
    public String getUuid() {
        return this.uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="products")
    public Set<ProductBrands> getProductBrandses() {
        return this.productBrandses;
    }
    
    public void setProductBrandses(Set<ProductBrands> productBrandses) {
        this.productBrandses = productBrandses;
    }

    @Override
    public Integer findID() {
        return getId();
    }




}


