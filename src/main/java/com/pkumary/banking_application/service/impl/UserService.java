package com.pkumary.banking_application.service.impl;

import com.pkumary.banking_application.dto.BankResponse;
import com.pkumary.banking_application.dto.UserRequest;

public interface UserService {

    BankResponse createAccount(UserRequest userRequest);
}
