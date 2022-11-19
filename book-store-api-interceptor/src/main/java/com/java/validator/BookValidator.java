package com.java.validator;

import com.java.commonfiles.Error;
import com.java.dto.BookRequestDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookValidator {

    public List<Error> validateCreateBookRequest(BookRequestDTO bookDTO) {

        List<Error> errors = new ArrayList<>();

        
        if(bookDTO.getName() == null){
            Error error = new Error("name", "book name is null");
            errors.add(error);
        }

        
        if(bookDTO.getYearOfPublication() == null){
            Error error = new Error("yop", "yop is null");
            errors.add(error);
        }

        if(bookDTO.getBookType() == null){
            errors.add(new Error("bookType", "bookType is null"));
        }

        return errors;
    }
}
