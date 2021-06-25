package web.model;

public class Car {
    private String brand;
    private String manufacturer;
    private String licensePlate;

    public Car(String brand, String manufacturer, String licensePlate){
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
