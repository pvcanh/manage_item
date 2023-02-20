/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageitem.dto;

/**
 *
 * @author pvcanh
 */
public class ItemDto {
    private String name;
    private String price;
    private String noted;
    private Integer quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNoted() {
        return noted;
    }

    public void setNoted(String noted) {
        this.noted = noted;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "name=" + name + ", price=" + price + ", noted=" + noted + ", quantity=" + quantity + '}';
    }
    
    
}
