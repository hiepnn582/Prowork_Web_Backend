package com.hiepnn.prowork.dtos;

import com.hiepnn.prowork.constants.Validations;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequest {
    @NotBlank(message = "{common.required}")
    @Size(
            min = Validations.MIN_USERNAME_CHARACTERS,
            message = "{common.min_characters}"
    )
    @Size(
            max = Validations.MAX_USERNAME_CHARACTERS,
            message = "{common.max_characters}"
    )
    private String username;

    @NotBlank(message = "{common.required}")
    @Size(
            min = Validations.MIN_PASSWORD_CHARACTERS,
            message = "{common.min_characters}"
    )
    @Size(
            max = Validations.MAX_PASSWORD_CHARACTERS,
            message = "{common.max_characters}"
    )
    @Pattern(
            regexp = Validations.REGEX_PASSWORD_RULES,
            message = Validations.PASSWORD_RULES
    )
    private String password;

    @NotBlank(message = Validations.CONFIRM_PASSWORD_RULES)
    private String confirmPassword;
}
