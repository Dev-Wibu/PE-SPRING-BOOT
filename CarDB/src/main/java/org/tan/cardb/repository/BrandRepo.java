package org.tan.cardb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tan.cardb.entity.Brand;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {


}
