package com.pzeszko.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Created by Admin on 01.05.2017.
 */
@Data
@AllArgsConstructor
@ToString
public class Message {

    private String header;
    private String payload;
}
