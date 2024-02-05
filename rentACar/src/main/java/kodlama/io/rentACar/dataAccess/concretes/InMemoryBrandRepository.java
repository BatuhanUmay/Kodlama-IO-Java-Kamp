package kodlama.io.rentACar.dataAccess.concretes;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // bu sınıf bir DataAccess nesnesidir
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();

        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "AUDI"));
        brands.add(new Brand(3, "MERCEDES"));
        brands.add(new Brand(4, "FIAT"));
        brands.add(new Brand(5, "RENAULT"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}