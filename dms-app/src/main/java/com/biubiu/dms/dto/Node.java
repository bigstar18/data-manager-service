package com.biubiu.dms.dto;

import lombok.Data;

import java.util.List;

@Data
public class Node {
    private Long id;
    private String name;
    private String icon;
    private String type;
    private String username;
    /*private Remote config;*/
    private String url;
    private List<Node> children;
}
