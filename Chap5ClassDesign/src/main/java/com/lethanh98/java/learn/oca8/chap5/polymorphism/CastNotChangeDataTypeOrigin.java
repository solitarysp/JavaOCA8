package com.lethanh98.java.learn.oca8.chap5.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

interface CastNotChangeInterface {
    public void show();
}

@Slf4j
public class CastNotChangeDataTypeOrigin {
    public static void main(String[] args) {
        CastNotChangeDTO castNotChangeDTO = new CastNotChangeDTO("Thành");
        Object o = castNotChangeDTO;
        CastNotChangeInterface castNotChangeInterface = (CastNotChangeInterface) o;
        castNotChangeInterface.show();
        String s = (String) o;
    }
}

@AllArgsConstructor
@Data
@Slf4j
class CastNotChangeDTO implements CastNotChangeInterface {
    private String name;

    @Override
    public void show() {
        log.info(name);
    }
}
