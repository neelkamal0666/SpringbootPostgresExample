package com.Fyle.banking.services;

import com.Fyle.banking.config.ErrorMessages;
import com.Fyle.banking.dao.BanksRepository;
import com.Fyle.banking.dao.BranchesRepository;
import com.Fyle.banking.domain.BranchesDomain;
import com.Fyle.banking.dto.BranchesDTO;
import com.Fyle.banking.dto.mappers.BranchMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanksServices {
    private final BranchesRepository branchesRepository;

    public BanksServices(BranchesRepository branchesRepository) {
        this.branchesRepository = branchesRepository;
    }

    //Method to get bank details by IFSC Code
    public BranchesDTO bankByIfscCode(String ifsc) throws Exception {
        BranchesDomain branchesDomain = this.branchesRepository.findByIfsc(ifsc);
        if(branchesDomain == null){
            throw new Exception(ErrorMessages.NOT_FOUND_EXCEPTION);
        }
        BranchMapper mapper = Mappers.getMapper(BranchMapper.class);
        return mapper.branchesToDTO(branchesDomain);
    }

    //Method to get the list of all branches of a city of a bank
    public List<BranchesDTO> branchesByNameAndCity(String name, String city) throws Exception {
        List<BranchesDomain> branchesDomains = this.branchesRepository.findByCityAndBank_Name(city.toUpperCase(), name.toUpperCase());
        BranchMapper mapper = Mappers.getMapper(BranchMapper.class);
        return mapper.branchesToDTOs(branchesDomains);
    }
}
