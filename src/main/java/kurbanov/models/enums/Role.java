package kurbanov.models.enums;

import org.springframework.security.core.GrantedAuthority;

/**
 * ~ @created 18/09/2023
 * ~ @project_name restaurant_project_myself
 * ~ @author kurbanov
 **/
public enum Role implements GrantedAuthority {
    ADMIN,CHEF,WAITER;

    @Override
    public String getAuthority() {
        return name();
    }
}
