package com.digitalinnovation.personapiimproved.controllers;

import com.digitalinnovation.personapiimproved.dto.request.PersonDTO;
import com.digitalinnovation.personapiimproved.dto.response.MessageResponseDTO;
import com.digitalinnovation.personapiimproved.exception.PersonNotFoundException;
import com.digitalinnovation.personapiimproved.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

  private final PersonService personService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
    return personService.create(personDTO);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
    return personService.findById(id);
  }

  @GetMapping
  public List<PersonDTO> listAll() {
    return personService.listAll();
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
    return personService.update(id, personDTO);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) throws PersonNotFoundException {
    personService.delete(id);
  }

}
