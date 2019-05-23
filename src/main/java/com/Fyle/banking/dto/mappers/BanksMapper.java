package com.Fyle.banking.dto.mappers;

import com.Fyle.banking.domain.BanksDomain;
import com.Fyle.banking.dto.BanksDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class BanksMapper {
    public abstract BanksDTO banksToDTO(BanksDomain banksDomain);
    public abstract List<BanksDTO> banksToDTOs(List<BanksDomain> banksDomain);
}
