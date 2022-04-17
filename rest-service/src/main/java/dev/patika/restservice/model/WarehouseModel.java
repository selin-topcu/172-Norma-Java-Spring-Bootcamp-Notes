package dev.patika.restservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
public class WarehouseModel {

    private Integer id;
    private String name;
    private String address;
    private WarehouseType type;
    private float area;
    private  double latitude;
    private double longitude;

    public enum WarehouseType{
        HOT, COLD
    }
}
