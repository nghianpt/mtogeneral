package com.mto.common.data.config;

import com.mto.common.entity.DBaseEntity;

import java.util.HashMap;


/**
 * Created by cpu11843-local on 5/3/17.
 */

public class DConfigFromFile extends DBaseEntity<DConfigFromFile> {
    public HashMap<String, String> config;
    public HashMap<String, String> stringMap;
}
