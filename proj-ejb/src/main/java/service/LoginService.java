package service;

import javax.inject.Inject;
import java.io.Serializable;

public class LoginService extends DefaultService implements Serializable {

    @Inject
    private LicenseService licenseService;
}
