package in.bushansirgur.springbootthymeleaf.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotNull
    private String title;

    @Column(name = "price")
    @NotNull
    private int price;

}
