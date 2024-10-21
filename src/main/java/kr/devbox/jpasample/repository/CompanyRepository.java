package kr.devbox.jpasample.repository;

import kr.devbox.jpasample.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository  extends JpaRepository<Company, Long> {

    Optional<Company> findTopByCompanyId(Long id);

//    List<Company> findAll();
}
