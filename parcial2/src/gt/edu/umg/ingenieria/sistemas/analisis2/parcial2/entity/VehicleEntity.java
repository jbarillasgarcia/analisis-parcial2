package gt.edu.umg.ingenieria.sistemas.analisis2.parcial2.entity;

import java.util.*;

public class VehicleEntity {
    
    private String licenseNumber;
    private String brand;
    private Integer model;
    private String color;

    public VehicleEntity() {
    }

    private VehicleOwnerEntity owner;

    private Set<VehicleServiceHistoryEntryEntity> serviceHistory;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleOwnerEntity getOwner() {
        return owner;
    }

    public void setOwner(VehicleOwnerEntity owner) {
        this.owner = owner;
    }

    public Set<VehicleServiceHistoryEntryEntity> getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(Set<VehicleServiceHistoryEntryEntity> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    
}