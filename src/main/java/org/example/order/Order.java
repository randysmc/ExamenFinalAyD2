package org.example.order;

import lombok.*;
import org.example.User;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Order {
    private User customerName;
    private ArrayList<Item> items;
    private User user;



}
