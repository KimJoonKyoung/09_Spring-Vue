package org.scoula.member.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChangePasswordDTO {
String username;
String oldPassword;
String newPassword;

}
