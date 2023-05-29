package com.splitscale.reems.security.auth;

import java.io.IOException;
import java.security.GeneralSecurityException;

import com.splitscale.reems.security.services.SecurityService;

public class ValidateJwtInteractor {
  private SecurityService service;

  public ValidateJwtInteractor(SecurityService service) {
    this.service = service;
  }

  public void validate(String jwtToken, String userId) throws GeneralSecurityException, IOException {
    service.validateJwt(jwtToken, userId);
  }
}
