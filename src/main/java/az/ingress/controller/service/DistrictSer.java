package az.ingress.controller.service;

public interface DistrictSer {
    Integer getPopulation(String district);
    String getHighestPopulationDistrict();
}
