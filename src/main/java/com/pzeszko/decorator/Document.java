package com.pzeszko.decorator;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

/**
 * Created by Admin on 15.05.2017.
 */
@Data
@ToString
public class Document {
    private String name;
    private LocalDate createdOn;
    private String sign;
}
