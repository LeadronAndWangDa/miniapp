package com.self.miniapp.util;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
}
