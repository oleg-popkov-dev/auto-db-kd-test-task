package kz.kazdream.model.dto;

import java.time.LocalDate;

public class CompanyDTO {

   private Long id;

   private String name;

   private String ceo;

   private String cto;

   private LocalDate foundationDate;

   private Long avgMadeCarsPerYear;

   private Long avgSoldCarsPerYear;

   private Double grossProfit;

   private Double operationProfit;

   private Double capitalization;


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCeo() {
      return ceo;
   }

   public void setCeo(String ceo) {
      this.ceo = ceo;
   }

   public String getCto() {
      return cto;
   }

   public void setCto(String cto) {
      this.cto = cto;
   }

   public LocalDate getFoundationDate() {
      return foundationDate;
   }

   public void setFoundationDate(LocalDate foundationDate) {
      this.foundationDate = foundationDate;
   }

   public Long getAvgMadeCarsPerYear() {
      return avgMadeCarsPerYear;
   }

   public void setAvgMadeCarsPerYear(Long avgMadeCarsPerYear) {
      this.avgMadeCarsPerYear = avgMadeCarsPerYear;
   }

   public Long getAvgSoldCarsPerYear() {
      return avgSoldCarsPerYear;
   }

   public void setAvgSoldCarsPerYear(Long avgSoldCarsPerYear) {
      this.avgSoldCarsPerYear = avgSoldCarsPerYear;
   }

   public Double getGrossProfit() {
      return grossProfit;
   }

   public void setGrossProfit(Double grossProfit) {
      this.grossProfit = grossProfit;
   }

   public Double getOperationProfit() {
      return operationProfit;
   }

   public void setOperationProfit(Double operationProfit) {
      this.operationProfit = operationProfit;
   }

   public Double getCapitalization() {
      return capitalization;
   }

   public void setCapitalization(Double capitalization) {
      this.capitalization = capitalization;
   }
}
