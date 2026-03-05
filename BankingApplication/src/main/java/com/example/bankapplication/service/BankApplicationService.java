package com.example.bankapplication.service;

import com.example.bankapplication.Mapper.BankApplicationMapper;
import com.example.bankapplication.entity.BankApplicationEntity;
import com.example.bankapplication.repository.BankApplicationRepository;
import com.swaggerexample.Swaggerex.model.BankDto;
import com.swaggerexample.Swaggerex.model.DepositAmount;
import com.swaggerexample.Swaggerex.model.WithdrawAmount;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BankApplicationService {

    private final BankApplicationRepository bankApplicationRepository;
    private final BankApplicationMapper bankApplicationMapper;

    public ResponseEntity<String> addAccount(BankDto bankDto) {
//        BankApplicationEntity bankApplicationEntity = BankApplicationEntity.builder()
//                .accountNumber(bankDto.getAccountNumber())
//                .accountHolderName(bankDto.getAccountHolderName())
//                .accountType(bankDto.getAccountType())
//                .mobile(bankDto.getMobile())
//                .balance(bankDto.getBalance())
//                .build();
        BankApplicationEntity bankApplicationEntity = bankApplicationMapper.dtoToEntity(bankDto);
        bankApplicationRepository.save(bankApplicationEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Account Created Successfully");
    }

    public ResponseEntity<BankDto> getAccountById(Long id) {
        BankApplicationEntity bankApplicationEntity = bankApplicationRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Account not found"));

        BankDto bankDto = bankApplicationMapper.entityTodto(bankApplicationEntity);
        return ResponseEntity.ok(bankDto);
    }


    public ResponseEntity<List<BankDto>> getAllAccounts() {
        List<BankApplicationEntity> allAccounts = bankApplicationRepository.findAll();
        List<BankDto> allAccountsbankDto = allAccounts.stream()
                .map(bankApplicationMapper::entityTodto)
                .toList();
        return ResponseEntity.ok(allAccountsbankDto);
    }

    public ResponseEntity<BankDto> depositAmount(String accountnumber, DepositAmount depositDto) {
        BankApplicationEntity bankApplicationEntity = bankApplicationRepository.findByAccountNumber(accountnumber)
                .orElseThrow(()->new RuntimeException("Account not found"));

        bankApplicationEntity.setBalance(bankApplicationEntity.getBalance()+depositDto.getAmount());
        bankApplicationRepository.save(bankApplicationEntity);
        BankDto bankDto = bankApplicationMapper.entityTodto(bankApplicationEntity);
        return ResponseEntity.ok(bankDto);
    }

    public ResponseEntity<BankDto> withdrawAmount(String accountnumber, WithdrawAmount withdrawDto) {
        BankApplicationEntity bankApplicationEntity = bankApplicationRepository.findByAccountNumber(accountnumber)
                .orElseThrow(()->new RuntimeException("Account not found"));

        if(bankApplicationEntity.getBalance()<withdrawDto.getAmount()){
            throw new RuntimeException("Invalid Amount");
        }

        bankApplicationEntity.setBalance(bankApplicationEntity.getBalance()-withdrawDto.getAmount());
        bankApplicationRepository.save(bankApplicationEntity);
        BankDto bankDto = bankApplicationMapper.entityTodto(bankApplicationEntity);
        return ResponseEntity.ok(bankDto);
    }
}
