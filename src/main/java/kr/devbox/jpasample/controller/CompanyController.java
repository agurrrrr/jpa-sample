package kr.devbox.jpasample.controller;

import io.swagger.v3.oas.annotations.Operation;
import kr.devbox.jpasample.entity.Company;
import kr.devbox.jpasample.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/")
public class CompanyController {

    final private CompanyRepository companyRepository;


    // get company list
    @Operation(summary = "회사 목록", description = "모든 회사 목록을 조회합니다.")
    @GetMapping("/companies")
    public List<Company> getCompanyList() {
        return companyRepository.findAll();
    }


    // get company by id
    @Operation(summary = "회사 조회", description = "회사 ID로 회사를 조회합니다.")
    @GetMapping("/company")
    public Company getCompany(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }


}
