package at.fh.swenga.f4u.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import at.fh.swenga.f4u.model.SubcategorieModel;

@Repository
public interface SubcategorieRepository extends JpaRepository<SubcategorieModel, Integer> {
	
	@Transactional
	public SubcategorieModel findFirstByName(String name);
}
