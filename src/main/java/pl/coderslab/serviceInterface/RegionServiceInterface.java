package pl.coderslab.serviceInterface;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.Region;

import java.util.List;

@Service
public interface RegionServiceInterface {

    public List<Region> findAllRegions();

    public Region findRegionById(Long id);

    public Region saveRegion(Region region);

    public Region editRegion(Region region);

    public void deleteRegion(Long id);

}
