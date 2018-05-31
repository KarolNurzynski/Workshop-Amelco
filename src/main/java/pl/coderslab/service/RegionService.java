package pl.coderslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.entity.Region;
import pl.coderslab.repository.RegionRepository;
import pl.coderslab.serviceInterface.RegionServiceInterface;

import java.util.List;

@Service
public class RegionService implements RegionServiceInterface {

    RegionRepository regionRepository;

    @Autowired
    RegionService(RegionRepository regionRepository) {
        this.regionRepository=regionRepository;
    }

    public List<Region> findAllRegions() {
        return regionRepository.findAll();
    }

    public Region findRegionById(Long id) {
        return regionRepository.findById(id).orElseGet(null);
    }

    public Region saveRegion(Region region) {
        return regionRepository.save(region);
    }

    public Region editRegion(Region region) {
        return regionRepository.save(region);
    }

    public void deleteRegion(Long id) {
        regionRepository.deleteById(id);
    }

}
