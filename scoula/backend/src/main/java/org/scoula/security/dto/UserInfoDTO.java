package org.scoula.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.scoula.security.account.domain.MemberVO;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
    String username;
    String email;
    List<String>roles;

    public static UserInfoDTO of(MemberVO member) {
        return new UserInfoDTO(
                member.getUsername(),
                member.getEmail(),
                member.getAuthList().stream()
                        .map(a->a.getAuth())
                        .toList()
        );
    }
}
