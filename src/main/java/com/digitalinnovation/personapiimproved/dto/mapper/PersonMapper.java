package com.digitalinnovation.personapiimproved.dto.mapper;

import com.digitalinnovation.personapiimproved.dto.request.PersonDTO;
import com.digitalinnovation.personapiimproved.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

  @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
  Person toModel(PersonDTO dto);

  PersonDTO toDTO(Person dto);
}