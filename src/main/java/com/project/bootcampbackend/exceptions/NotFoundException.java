package com.project.bootcampbackend.exceptions;

import com.project.bootcampbackend.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
