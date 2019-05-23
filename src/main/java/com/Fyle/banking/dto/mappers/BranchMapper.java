package com.Fyle.banking.dto.mappers;

import com.Fyle.banking.domain.BranchesDomain;
import com.Fyle.banking.dto.BranchesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class BranchMapper {
    public abstract BranchesDTO branchesToDTO(BranchesDomain branchesDomain);
    public abstract List<BranchesDTO> branchesToDTOs(List<BranchesDomain> branchesDomains);
}
