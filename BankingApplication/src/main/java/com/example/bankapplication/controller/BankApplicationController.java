package com.example.bankapplication.controller;

import com.example.bankapplication.service.BankApplicationService;
import com.swaggerexample.Swaggerex.api.BankApi;
import com.swaggerexample.Swaggerex.model.BankDto;
import com.swaggerexample.Swaggerex.model.DepositAmount;
import com.swaggerexample.Swaggerex.model.WithdrawAmount;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bank")
@AllArgsConstructor
public class BankApplicationController implements BankApi  {

    private final BankApplicationService bankApplicationService;

    @Override
    public ResponseEntity<String> addAccount(BankDto bankDto) {
        return bankApplicationService.addAccount(bankDto);
    }

    @Override
    public ResponseEntity<BankDto> depositAmount(String accountnumber, DepositAmount depositDto) {
        return bankApplicationService.depositAmount(accountnumber,depositDto);
    }

    @Override
    public ResponseEntity<BankDto> getAccountById(Long id) {
        return bankApplicationService.getAccountById(id);
    }

    @Override
    public ResponseEntity<List<BankDto>> getAllAccounts() {
        return bankApplicationService.getAllAccounts();
    }

    @Override
    public ResponseEntity<BankDto> withdrawAmount(String accountnumber, WithdrawAmount withdrawDto) {
        return bankApplicationService.withdrawAmount(accountnumber, withdrawDto);
    }


}
