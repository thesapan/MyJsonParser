package dev.ssdd;

import java.util.HashMap;

public class Value <T>{
    T value;
    Value(){
        value = null;
    }
    Value(T value){
        this.value = value;
    }
    public boolean is_obj() {
        return value instanceof JsonObject;
    }
    public boolean isArr() {
        return value instanceof JsonArr;
    }
    public boolean is_str() {
        return value instanceof String;
    }

    public boolean is_int() {
        return value instanceof Integer;
    }

    public boolean is_bool() {
        return value instanceof Boolean;
    }

    public String getString(){
        return (String) value;
    }

    public boolean getBoolean(){
        return (boolean) value;
    }

    public int getInteger(){
        return (int) value;
    }

    public JsonObject getObject() {
        return (JsonObject) value;
    }

    public JsonArr getArr() {
        return (JsonArr) value;
    }
}
