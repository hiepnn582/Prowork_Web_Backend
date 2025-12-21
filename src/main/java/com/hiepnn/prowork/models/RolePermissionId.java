package com.hiepnn.prowork.models;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RolePermissionId implements Serializable {
    private Integer roleId;

    private Integer permissionId;
}
