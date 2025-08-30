package az.ingress.controller.controller;

import az.ingress.controller.service.DistrictSer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class DistrictController {

    public final DistrictSer districtSer;

    @GetMapping("/population")
    public Integer populationGivenDistrict(@RequestParam("district") String d) {
        return districtSer.getPopulation(d);
    }

    @GetMapping("/max-population-district")
    public String maxPopulationDistrict() {
        return districtSer.getHighestPopulationDistrict();
    }

}
