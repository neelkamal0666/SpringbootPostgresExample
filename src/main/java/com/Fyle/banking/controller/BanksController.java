package com.Fyle.banking.controller;

import com.Fyle.banking.config.ApiEndPoints;
import com.Fyle.banking.dto.BanksDTO;
import com.Fyle.banking.dto.BranchesDTO;
import com.Fyle.banking.services.BanksServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class BanksController {
    private final BanksServices banksServices;

    public BanksController(BanksServices banksServices) {
        this.banksServices = banksServices;
    }

    @GetMapping(path = ApiEndPoints.BANK_DETAILS_BY_IFSC)
    @ResponseBody
    public BranchesDTO bankByIFSC(@PathVariable String ifsc) throws Exception {
        return this.banksServices.bankByIfscCode(ifsc);
    }

    @GetMapping(path = ApiEndPoints.BRANCHES_BY_NAME_AND_CITY)
    @ResponseBody
    public List<BranchesDTO> branchesByNameAndCity(@PathVariable String name,@PathVariable String city) throws Exception {
        return this.banksServices.branchesByNameAndCity(name, city);
    }
}
