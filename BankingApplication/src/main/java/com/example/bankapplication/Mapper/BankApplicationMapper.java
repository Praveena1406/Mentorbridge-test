package com.example.bankapplication.Mapper;

import com.example.bankapplication.entity.BankApplicationEntity;
import com.swaggerexample.Swaggerex.model.BankDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BankApplicationMapper {
     public final ModelMapper modelMapper;

     public BankApplicationEntity dtoToEntity(BankDto bankDto){
         return modelMapper.map(bankDto,BankApplicationEntity.class);
     }

     public  BankDto entityTodto(BankApplicationEntity bankApplicationEntity){
         return modelMapper.map(bankApplicationEntity,BankDto.class);
     }
}
