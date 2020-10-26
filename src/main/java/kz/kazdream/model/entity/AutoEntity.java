package kz.kazdream.model.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "autos")
public class AutoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private SpecEntity spec;
    @ManyToOne
    private CompanyEntity company;


    private String mark;

    private String model;

    private String vin;

    private String color;

    private LocalDate manufacturedDate;

    private Double engineVolume;

    private Integer horsePower;

    private Integer gasTank;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SpecEntity getSpec() {
        return spec;
    }

    public void setSpec(SpecEntity spec) {
        this.spec = spec;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Integer getGasTank() {
        return gasTank;
    }

    public void setGasTank(Integer gasTank) {
        this.gasTank = gasTank;
    }
}
