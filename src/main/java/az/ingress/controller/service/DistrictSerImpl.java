
package az.ingress.controller.service;


import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@Service
public class DistrictSerImpl implements DistrictSer {
    Map<String, Integer> districtPopulation = new HashMap<>();

    public DistrictSerImpl() {
        districtPopulation.put("Narimanov", 180000);
        districtPopulation.put("Yasamal", 300000);
        districtPopulation.put("Binagadi", 270000);
        districtPopulation.put("Sabail", 160000);
        districtPopulation.put("Khatai", 250000);
        districtPopulation.put("Surakhani", 230000);
    }

    @Override
    public Integer getPopulation(String district) {
        return Optional.ofNullable(
                districtPopulation
                .get(district))
                .orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @Override
    public String getHighestPopulationDistrict() {
        Integer population = Collections.max(districtPopulation.values());
        return districtPopulation.entrySet().stream().filter(x -> x.getValue().equals(population))
                .toList().toString();

    }
}

